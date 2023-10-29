package travelers;

import java.util.Scanner;

public class Person {
	public String name;
	public int age;
	public String passportNumber;
	public String travelPurpose;
	public String visa;

	public Person(String name1, int age1, String passportNumber1, String travelPurpose1, String visa1) {
		name = name1;
		age = age1;
		passportNumber = passportNumber1;
		travelPurpose = travelPurpose1;
		visa = visa1;
		
	}
	
	public void displayName()
	{
		System.out.println(name);
	}
	

}
