package by.dbarkova.runner;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainAppQueue {

public static void main(String[] args) {
	
	Queue<String> queue = new PriorityQueue<>();
	
	queue.add("1");
	queue.add("2");
	queue.add("3");
	queue.add("4");
	queue.add("5");
	queue.add("6");
	queue.add("7");
	queue.add("8");
	queue.add("9");
	queue.add("10");
	
	queue.offer("11");
	
	for(String s : queue){
		System.out.println(s);
	}
	
	Iterator<String> qit = queue.iterator();
	while(qit.hasNext()){
		System.out.println(qit.next());
	}
	
	String s = queue.poll();
	System.out.println("s: " + s + " size: " +  queue.size());
	
	String str = queue.peek();
	System.out.println("s: " + str + " size: " +  queue.size());
	
}
}