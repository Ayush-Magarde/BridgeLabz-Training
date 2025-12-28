package com.constructors.levelone;

public class CourseMain {

	public static void main(String[] args) {
		Course course1 = new Course ("B.Tech", 4, 100000);
		Course course2 = new Course ("BBA", 3, 20000);
		course1.displayCourseDetails();
		course2.displayCourseDetails();
		Course.updateInstituteName("New University");
		Course course3 = new Course ("B.Com", 3, 30000);
		course3.displayCourseDetails();
	}

}
