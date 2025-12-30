/* 13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days. */

import java.util.Scanner;
class SandeepFitnessChallengeTracker {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int[] workoutWeek = new int[7];
		int pushUpsSum = 0;
		for (int i = 0; i < 7; i++) {
			System.out.println("Did you workout on day " + (i+1) + ": Enter yes/no");
			String checkWorkout = input.nextLine().toLowerCase();
			if (checkWorkout.equals("yes")) {
				System.out.println("How many push-ups did you do ?");
				int dailyPushUps = input.nextInt();
				input.nextLine();
				pushUpsSum += dailyPushUps;
			}
			else if (checkWorkout.equals("no")) {
				System.out.println("Skip day");
				continue;
			}
			else {
				System.out.println("Invalid input.. counting as skip day");
			}
		}
		System.out.println("You did " + pushUpsSum + " push-ups this week");
	}
}