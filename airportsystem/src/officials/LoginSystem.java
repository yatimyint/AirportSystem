package officials;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class LoginSystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> employeesWorking = Arrays.asList(32188, 51332, 89717, 60221, 42436);
		Employee[] people = new Employee[5];
		int i = 0;
		int j = 0;
		int k = 0;
		
		System.out.print("Welcome to the International Immigration Office. Enter your name and ID.");

		while(i != 5) {
			System.out.print("\nName: ");
			String name = scanner.nextLine();
			System.out.print("\nID: ");
			int ID = scanner.nextInt();
			scanner.nextLine();
			people[i] = new Employee(name, ID);
			i++;
			
			if(!employeesWorking.contains(ID)) {
			k++;
		}
			}
		
		System.out.print("Employees Working Today: ");
		while(j < people.length) {
		System.out.println("\n" + people[j].name + " " + people[j].ID);
		j++;
		}
		
		System.out.print("\nEmployees Missing from the Roster: ");
		System.out.print(k);

		}
	
	

}
