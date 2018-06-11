package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList
				(new Person("vamshi", "kuchikulla", 32),
				 new Person("Dharmavardhan", "Govindu", 42),
				 new Person("Chinni", "Aadula", 22),
				 new Person("Naveen", "sudhireddy", 30),
				 new Person("Sumathi", "manda", 52));

		// sort the collection
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				return p1.getLastName().compareTo(p2.getLastName());
			}
		});
		
		//print all the records
		printAll(people);
	}

	//print records method
	private static void printAll(List<Person> people) {
		for(Person p:people) {
			System.out.println("list of people  :"+p.toString());
		}
	}
	
	//print records with 
}
