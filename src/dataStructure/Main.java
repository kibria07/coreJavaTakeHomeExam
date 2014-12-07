package dataStructure;

public class Main {

	
	public static void main(String[] args) {
		
		UseStructure1 ds = new UseStructure1();
		ds.addByArrayList("happy mohi");
		ds.addByLinkedList(" zahid bhai");
		ds.addByQueue("hello rofiq");
		ds.addByStack("insert");
		System.out.println(ds.returnByArrayList());
		System.out.println(ds.returnByLinkedList());
		ds.returnByQueue();
		ds.returnByStack();
		
		
		
		
		
	}

}
