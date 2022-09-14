package First_Task;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("serialize.txt");
		Employee emp = new Employee("Alex", 01643, 23000);
		Methods methods = new Methods();
		
		System.out.print("-Object serialization:" + "\n1)");
		methods.serialize(file, emp);
		System.out.println(methods.deserialize(file));
		
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Bruse", 30532, 2300));
		empList.add(new Employee("Ben", 58266, 15500));
		empList.add(new Employee("Fox", 10750, 110000));
		empList.add(new Employee("Jasmine", 83671, 55310));
		empList.add(new Employee("Natalia", 47810, 1345000));
		
		System.out.println("\n-List serialization:");
		
		int i = 1;
		for(Employee e : empList) {
			methods.serialize(file, e);
			System.out.println(i + ")" + methods.deserialize(file));
			i++;
		}
		

	}

}
