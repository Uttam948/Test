package hackerRankTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Hacker {
	
	

	public static void main(String[] args) {
	
		
	}
}

class Mammal{}

class Bat extends Mammal{}

class Cat extends Mammal{}

class Sat extends Mammal{}

class Fur<T extends Mammal>{
	void clean() {
		var bat = new Fur<Bat>();
		var cat = new Fur<Cat>();
		var sat = new Fur<Sat>();
	}
}
	
	

