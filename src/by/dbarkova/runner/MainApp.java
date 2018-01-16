package by.dbarkova.runner;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainApp {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add(new String("a"));
		list.add(new String("b"));
		list.add(new String("c"));
		list.add(new String("d"));
		list.add(new String("e"));
		//list.add(new Date());
		//list.add(new Integer(3));
		
		for(int i = 0; i < list.size(); i++){
			String s = list.get(i);
			System.out.println(s);
//			if(o.getClass().equals(String.class)){
//			String s = (String)o;
//		}else if(o.getClass().equals(Date.class)){
//			Date d = (Date)o;
//		}else if(o.getClass().equals(Integer.class)){
//			Integer e = (Integer)o;
		}
		
		list.set(3, "2");
		
		list.add(3, "3");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s + " with iterator");
			
			//list.remove(s);
			
			//it.remove();
		}
//		String s = it.next();
//		System.out.println(s);
		
		ListIterator<String> lit = list.listIterator();
		
		
		
		for(String s : list){
			System.out.println("For each " + s);
		}
		
//		for(int c = 0; c < list.size(); c++){
//		Iterator<String> str = list.iterator();
//		System.out.println("List iterator " + str);
//		}
		
		}
}
