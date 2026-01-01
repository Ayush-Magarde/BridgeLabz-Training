package com.objectmodelling.universityManagementSystem1;

public class Main {

		public static void main(String[] args) {
			
			Student student1 = new Student("Ayush");
			Student student2 = new Student("Aman");
			
			Professor professor1 = new Professor ("Dr. Sharma");
			
			Course course1 = new Course("Java");
			
			course1.assignPorfessor(professor1);
			
			student1.enrollCourse(course1);
			student2.enrollCourse(course1);
		}
}
