package dayseven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class ComparableAndComparator {

	public static void main(String[] args) {
		// Write an example for Comparable and Comparator.
		Pet a1 = new Pet("Fido", 2, "Borzoi");
		Pet a2 = new Pet("Snuffy", 1, "Persian Shorthair");
		Pet a3 = new Pet("Apollo", 4, "African Grey");
		Pet a4 = new Pet("Meevin", 3, "Scottish Fold");

		List<Pet> pets = new ArrayList<>();

		pets.add(a4);
		pets.add(a2);
		pets.add(a3);
		pets.add(a1);

		System.out.println("\nBefore Sorting");

		for (Pet a : pets) {
			System.out.println("Name: " + a.getName() + ", Type: " + a.getType() + ", Age: " + a.getAge());
		}

		Collections.sort(pets);
		System.out.println("\nAfter Sorting");
		for (Pet a : pets) {
			System.out.println("Name: " + a.getName() + ", Type: " + a.getType() + ", Age: " + a.getAge());
		}
	}

}

@Getter
@Setter
@AllArgsConstructor
class Pet implements Comparable<Pet> {
	private String name;
	private int age;
	private String type;

	@Override
	public int compareTo(Pet p) {
		return this.name.compareTo(p.getName());
	}
}

class AgeCheck implements Comparator<Pet> {
	@Override
	public int compare(Pet p1, Pet p2) {
		if (p1.getAge() > p2.getAge()) {
			return 1;
		}
		if (p1.getAge() < p2.getAge()) {
			return -1;
		}
		return 0;
	}
}

class TypeCheck implements Comparator<Pet> {
	@Override
	public int compare(Pet p1, Pet p2) {
		return p1.getType().compareTo(p2.getType());
	}
}