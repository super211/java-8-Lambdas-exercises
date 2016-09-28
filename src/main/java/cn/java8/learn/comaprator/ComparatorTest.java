package cn.java8.learn.comaprator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
	public static void main(String[] args){
		
		/********Normal Implementation**********/
		List<Person> personList = Person.createShortList();
		
		Collections.sort(personList, new Comparator<Person>(){
			public int compare(Person p1, Person p2){
				return p1.getSurName().compareTo(p2.getSurName());
			}
		});
		
		//Print Asc
		System.out.println("=====Sorted Asc SurName===");
		for(Person p : personList){
			p.printName();
		}
		
		Collections.sort(personList, new Comparator<Person>(){
			public int compare(Person p1, Person p2){
				return p2.getSurName().compareTo(p1.getSurName());
			}
		});
		
		//Print Desc
		System.out.println("=====Sorted Desc SurName===");
		for(Person p : personList){
			p.printName();
		}
		
		/********Lambda Implementation**********/
		//Print Asc
		System.out.println("=====Lambda Sorted Asc SurName===");
		Collections.sort(personList, (p1, p2) -> p1.getSurName().compareTo(p2.getSurName()));
		for(Person p : personList){
			p.printName();
		}
		
		//Print Asc
		System.out.println("=====Lambda Sorted Asc SurName===");
		Collections.sort(personList, (p1, p2) -> p2.getSurName().compareTo(p1.getSurName()));
		for(Person p : personList){
			p.printName();
		}
	}
}
