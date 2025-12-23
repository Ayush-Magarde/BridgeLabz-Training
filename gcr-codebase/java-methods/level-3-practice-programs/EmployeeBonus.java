import java.util.Scanner;
class EmployeeBonus {

	// Method to generate salary and years of service
	public static int[][] generateEmployeeData(int n) {
		int[][] data = new int[n][2];
		for(int i = 0; i < n; i++) {
			data[i][0] = (int)(Math.random() * 90000) + 10000;
			data[i][1] = (int)(Math.random() * 10) + 1;
		}
		return data;
	}

	// Method to calculate new salary and bonus
	public static int[][] calculateBonus(int[][] data) {
		int[][] result = new int[data.length][2];
		for(int i = 0; i < data.length; i++) {
			int salary = data[i][0];
			int years = data[i][1];
			int bonus = (years > 5) ? salary * 5 / 100 : salary * 2 / 100;
			result[i][0] = salary + bonus;
			result[i][1] = bonus;
		}
		return result;
	}

	// Method to calculate totals
	public static void displayTotals(int[][] oldData,int[][] newData) {
		int oldSum = 0,newSum = 0,bonusSum = 0;
		for(int i = 0; i < oldData.length; i++) {
			oldSum += oldData[i][0];
			newSum += newData[i][0];
			bonusSum += newData[i][1];
		}
		System.out.println("Old Salary Sum: " + oldSum);
		System.out.println("New Salary Sum: " + newSum);
		System.out.println("Total Bonus: " + bonusSum);
	}

	// Main method
	public static void main(String[] args) {
		int[][] oldData = generateEmployeeData(10);
		int[][] newData = calculateBonus(oldData);
		displayTotals(oldData,newData);
	}
}
