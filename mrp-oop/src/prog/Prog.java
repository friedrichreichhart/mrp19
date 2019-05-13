package prog;

import data.Person;
import data.Student;

public class Prog {

	public static void main(String[] args) {
		
		// Variable mit Namen p1 vom Typ Person
		data.Person p1;
		// p1 muss instanziert werder
		p1 = new data.Person();
		//
		p1.setVorname("Hans");
		p1.setNachname("Mueller");
		System.out.println(p1);
		//
		Person p2 = new Person();
		System.out.println(p2);
		//
		Student s1 = new Student();
		s1.setVorname("Julia");
		s1.setNachname("Huber");
		System.out.println(s1);
		//
		Person student = new Student();
		//
		if (student instanceof Person)
			System.out.println("Person");
		//
		if (student instanceof Student) {
			System.out.println("Student");
			Student tempStud = (Student) student;
			tempStud.getSchulstufe();
		}
		//
		
		

	}

}
