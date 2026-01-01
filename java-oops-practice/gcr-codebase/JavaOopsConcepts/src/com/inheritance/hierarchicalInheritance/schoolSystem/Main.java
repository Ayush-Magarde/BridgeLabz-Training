package com.inheritance.hierarchicalInheritance.schoolSystem;

public class Main {

	public static void main(String[] args) {
		
        Person person1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person person2 = new Student("Ayush", 22, "B.Tech");
        Person person3 = new Staff("Ramesh", 45, "Administration");
        
        Person[] people = {person1, person2, person3};
        
        for (Person p : people) {
        	p.displayBasicInfo();
        	
        	if(p instanceof Teacher) {
        		((Teacher) p ).displayRole();
        	} else if (p instanceof Student) {
                ((Student) p).displayRole();
            } else if (p instanceof Staff) {
                ((Staff) p).displayRole();
            }
        	
        	System.out.println();
        }
	}
}
