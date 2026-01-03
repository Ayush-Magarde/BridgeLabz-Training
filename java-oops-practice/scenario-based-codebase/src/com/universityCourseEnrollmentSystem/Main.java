package com.universityCourseEnrollmentSystem;

public class Main {
	
	public static void main(String[] args) {
		
		Student ugStudent = new Undergraduate(1, "Ayush");
		Student pgStudent = new Postgraduate(2, "Aman");
		
		Course java = new Course("CS101", "Java Programming", 4);
		Course ai = new Course("CS102", "Artificial Intelligence", 5);
		
		Enrollment e1 = new Enrollment(ugStudent, java);
		Enrollment e2 = new Enrollment(pgStudent, ai);
		
		Faculty faculty = new Faculty("Dr. Sharma");
		
		faculty.assignGrade(e1, "A");
		faculty.assignGrade(e2, "Pass");
		
        e1.displayEnrollment();
        e2.displayEnrollment();
	}

}
