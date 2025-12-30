import java.util.Scanner;
class SchoolBusAttendanceSystem {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String[] students = new String[10];
		int present = 0;
		int absent = 0;
		System.out.println("SCHOOL BUS ATTENDANCE SYSTEM\n");
		System.out.println("--------------------------------------------------\n");
		for(int i = 0; i < students.length; i++) {
			System.out.println("Student " + (i+1) + " present/absent");
			students[i] = input.next().toLowerCase();
		}
		for (String presence : students) {
			if (presence.equals("present")) present++;
			else if (presence.equals("absent")) absent++;
		}
		System.out.println ("--------------------------------------------------\n");
		System.out.println("Present: " + present);
		System.out.println("Absent: " + absent);
	}
}