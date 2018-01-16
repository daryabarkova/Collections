package by.dbarkova.runner;

import java.util.LinkedList;
import java.util.Queue;

public class MainAppLinkedList {

	public static void main(String[] args) {
		Queue<String> qlist = new LinkedList<>();
		
		qlist.add("a");
		qlist.add("b");
		qlist.add("c");
		qlist.add("d");
		
		for(String s : qlist){
			System.out.println("qList: " + s);
		}
		
		LinkedList<String> list = new LinkedList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for(String str : list){
			System.out.println("List: " + str);
		}
		
		String elm = list.get(3);
		System.out.println(elm);

	}

}
