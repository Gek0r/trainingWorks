package test.com.training;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class CollectionExamples {

	public static void main(String[] args) {
		// Write a programs for each of below for adding, remove and iteration using
		// iterator

		// a few classes for lists to work with
		Animal a1 = new Animal("Fido", 2, "Borzoi");
		Animal a2 = new Animal("Snuffy", 1, "Persian Shorthair");
		Animal a3 = new Animal("Apollo", 4, "African Grey");
		Animal a4 = new Animal("Meevin", 3, "Scottish Fold");

		// ArrayList
		List<String> students = new ArrayList<String>();

		// ArrayList adding and removing, can handle duplicates

		students.add("Mike");
		students.add("Anna");
		students.add("Jamie");
		students.add("Mike");
		System.out.println("Array List");
		for (String student : students) {
			System.out.println(student);
		}

		students.remove(0);

		// ArrayList Iterator
		System.out.println("\nArray List with Removed Element Iterated");
		Iterator<String> itr = students.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		// LinkedList
		List<Integer> empID = new LinkedList<>();

		// LinkedList adding elements
		empID.add(12345);
		empID.add(23451);
		empID.add(53142);
		empID.add(14232);

		// LinkedList looping through elements
		System.out.println("\nLinked List");
		for (Integer id : empID) {
			System.out.println(id);
		}
		// LinkedList removing elements
		empID.remove(2);
		System.out.println("\nLinked List With Removed Element Iterated");
		// LinkedList Iterator
		Iterator<Integer> idItr = empID.iterator();

		while (idItr.hasNext()) {
			System.out.println(idItr.next());
		}

		// Vector
		Vector<String> measures = new Vector<>();
		measures.add("Kelvin");
		measures.add("Gram");
		measures.add("Velocity");

		System.out.println("\nVector");

		// Vector looping through elements
		for (String v : measures) {
			System.out.println(v);
		}
		System.out.println("\nVector iteration(enumeration)");
		// Iteration Through Vector
		Enumeration<String> eNum = measures.elements();

		while (eNum.hasMoreElements()) {
			System.out.println(eNum.nextElement());
		}

		// Stack
		Stack<String> countries = new Stack<>();
		System.out.println("\nStack");

		// adding stack elements
		countries.push("Mexico");
		countries.push("Oman");
		countries.push("Hungary");

		System.out.println(countries);

		System.out.println(countries.peek());
		System.out.println(countries.peek());

		// removing stack elements
		System.out.println(countries.pop());
		System.out.println(countries.pop());

		System.out.println(countries);

		// HashSet
		Set<String> cities = new HashSet<>();
		System.out.println("\nHashSet");
		cities.add("Dallas");
		cities.add("New Delhi");
		cities.add("Tokyo");
		cities.add("Berlin");

		for (String city : cities) {
			System.out.println(city);
		}

		cities.remove("Berlin");

		Iterator<String> cItr = cities.iterator();
		System.out.println("\nHashSet Iterator");
		while (cItr.hasNext()) {
			System.out.println(cItr.next());
		}

		// LinkedHashSet
		Set<String> dogs = new LinkedHashSet<>();

		dogs.add("Pug");
		dogs.add("Great Dane");
		dogs.add("Spaniel");

		System.out.println("\nLinkedHashSet");

		for (String dog : dogs) {
			System.out.println(dog);
		}

		// remove linked hash set item
		dogs.remove("Pug");

		System.out.println("\nLinkedHashSet Iterator");
		Iterator<String> dItr = dogs.iterator();
		while (dItr.hasNext()) {
			System.out.println(dItr.next());
		}

		// TreeSet
		Set<String> users = new TreeSet<>();

		// adding to tree set
		users.add("Dave37");
		users.add("OceanSouls");
		users.add("NightHarvester");

		System.out.println("\nTreeSet");

		for (String user : users) {
			System.out.println(user);
		}

		users.remove("OceanSouls");

		System.out.println("\nTreeSet Iterator");

		Iterator<String> uItr = users.iterator();

		while (uItr.hasNext()) {
			System.out.println(uItr.next());
		}

		// HashMap declaration
		Map<String, Animal> petMap = new HashMap<>();

		// Inserting Elements
		petMap.put("P1", a1);
		petMap.put("P2", a2);
		petMap.put("P3", a3);

		// Removing Elements
		petMap.remove("P1");

		// Hash map Iterator
		Iterator<Map.Entry<String, Animal>> petMapItr = petMap.entrySet().iterator();

		while (petMapItr.hasNext()) {
			System.out.println(petMapItr.next());
		}

		// LinkedHashMap
		System.out.println("\nLinkedHashMap");

		Map<String, Animal> petLHM = new LinkedHashMap<>();

		petLHM.put("Pet1", a1);
		petLHM.put("Pet2", a2);
		petLHM.put("Pet3", a3);
		petLHM.put("Pet4", a4);

		for (Map.Entry<String, Animal> animal : petLHM.entrySet()) {
			System.out.println(animal.getKey() + " " + animal.getValue());
		}

		petLHM.remove("Pet3");
		
		System.out.println("\nLinkedHashMap Iterator");
		
		Iterator<Map.Entry<String, Animal>> aItr = petLHM.entrySet().iterator();
		while(aItr.hasNext()) {
			System.out.println(aItr.next());
		}
		
		
		
		// TreeMap
		System.out.println("\nTreeMap");

		Map<String, Animal> petTM = new TreeMap<>();

		petTM.put("Pet4", a4);
		petTM.put("Pet1", a1);
		petTM.put("Pet3", a3);
		petTM.put("Pet2", a2);
		
		for (Map.Entry<String, Animal> animal : petTM.entrySet()) {
			System.out.println(animal.getKey() + " " + animal.getValue());
		}

		System.out.println("\nTreeMap Iterator");
		
		petTM.remove("Pet1");
		
		Iterator<Map.Entry<String, Animal>> pItr = petTM.entrySet().iterator();
		while(pItr.hasNext()) {
			System.out.println(pItr.next());
		}
	}

}
