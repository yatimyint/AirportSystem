package travelers;

public class Example {
	
	public static void main(String[] args)
	{
		SampleQuestions eg1 = new SampleQuestions();
		eg1.setName("John Smith");
		eg1.setAge(30);
		eg1.setPassportNumber("MO993353");
		eg1.setTravelPurpose("Work");
		eg1.setVisa("Work");


		System.out.println("Sample Questions and Answers at Immigration:");
		System.out.println("\nName: " + eg1.getName());
		System.out.println("Age: " + eg1.getAge());
		System.out.println("Passport Number: " + eg1.getPassportNumber());
		System.out.println("What is the purpose of your travel (education/work/visit)? " + eg1.getTravelPurpose());
		System.out.println("What visa are you on (education/work/visit)? " + eg1.getVisa());
	}

}
