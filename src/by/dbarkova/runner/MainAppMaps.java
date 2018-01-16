package by.dbarkova.runner;

import java.util.HashMap;
import java.util.Map;

public class MainAppMaps {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		map.put(new Integer(2), new String("Student1"));
		map.put(new Integer(3), new String("Student2"));
		map.put(new Integer(4), new String("Student3"));
		
		for(int i = 1; i < map.size(); i++){
			System.out.println(map.get(i + 1));
		}

	}

}
