package dataStructure;
import java.util.*;

/*import ds.ArrayList;
import ds.Iterator;
import ds.LinkedList;
import ds.List;
import ds.Queue;
import ds.Stack;
import ds.String;*/

public class UseStructure1 {
	LinkedList<String> list;
	ArrayList<String> arrayList;
	Stack<String> stack;
	Queue<String> queue;
	
	//add data into the LinkedList
	public void addByLinkedList(String name){
		 list = new LinkedList<String>();
		 
		 String array[]= {"hello","world","iphone"};///initiallize array here 
		 
		 
		list.add(name);
		for(String ar:array)///for each element in my "array" 
		list.add(ar);
		}

	//Retrieve data and return the LinkedList
	public LinkedList<String> returnByLinkedList(){
		/*List <String> list = new LinkedList<String>();
		
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
	
			
	return  list;
			
	}
	
	//add data into the ArrayList
	public void addByArrayList(String name){
		List <String>arraylist = new ArrayList<String>();
		arraylist.add(name);
		arraylist.add("C sharp");
		

		 
			
	}
	//Retrieve data and return the ArrayList
	public ArrayList<String> returnByArrayList(){
		List <String>arraylist = new ArrayList<String>();
		arraylist.add("computer ");
		arraylist.add("python");
		Iterator iterator = arraylist.iterator();
		while(iterator.hasNext()){
		  System.out.println(iterator.next());
		}
		
		
		
		
				
	return arrayList;
				
	}
	//add data into the Stack
	public void addByStack(String name){
		Stack s = new Stack();
		s.push("maffi");
		s.push("robert");
		s.push("gates");
		
		//System.out.println(s);

			 
				
	}
	//Retrieve data and return as Stack order
	public Stack<String> returnByStack(){
		
		Stack s = new Stack();
		s.push("key");
		//System.out.println(s);
		
			
					
	return stack;
					
	}
	//add data in Queue order
	public void addByQueue(String name){
		Queue<String> queue = new LinkedList();
		queue.offer(name);
		

			 
				
	}
	//Retrieve data and return in Queue order
	public Queue<String> returnByQueue(){
		Queue<String> queue = new LinkedList();
		queue.add("hello");
		queue.add("iphone 6");
		
		Iterator iterator = queue.iterator();
		while(iterator.hasNext()){
		  System.out.println(iterator.next());
		}
		
		
		
			
					
	return queue;
					
	}
		
}



