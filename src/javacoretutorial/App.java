package javacoretutorial;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Person{
	private String name;
	private int number;
	
	public Person(String name, int number) {
		this.name = name;
		this.number = number;
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	public void intro() {
		System.out.println(name+" : "+number);
	}
}

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person("Rin", 111);
		Person p2 = new Person("Jera", 112);
		Person p3 = new Person("Jera", 112);
		
		
		
		Map<Person, Integer> map = new HashMap<Person, Integer>();
		map.put(p1, 10);
		map.put(p2, 20);
		map.put(p3, 100);
		
		for(Person person : map.keySet()) {
			//person.intro();
			System.out.println(map.get(person));
		}
	}
}
