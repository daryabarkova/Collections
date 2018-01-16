package by.dbarkova.runner;

import java.util.HashSet;
import java.util.Set;

public class MainAppHashSet {

	public static void main(String[] args) {
		Set<String> string = new HashSet<>();
		
		string.add("a");
		string.add("b");
		string.add("a");
		string.add("d");
		string.add("b");
		
		for(String s : string){
			System.out.println("HashSet value: " + s);
		}

	}

}
