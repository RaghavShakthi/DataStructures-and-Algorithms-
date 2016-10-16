import java.util.Scanner;
import java.io.*;

public class Stack1 {

	public static Node head = null; 
	
	public class Node{
		int data;
		Node next;
		public Node(int val){
			data = val;
			next = null;
		}
	}
	
	public static void main(String args[]){
		
		Scanner in = new Scanner(System.in);
		Stack1 o = new Stack1();
		System.out.println("Enter the Number of items");
		int n  = in.nextInt();
		
		
		for (int i=1;i<=n;i++){ 
			
			//newNode = null;
			Node newNode = o.new Node(i);
			newNode.next = head;
			head =newNode;
		}
		
		Node temp = head;
		while(temp!=null){
				
				System.out.print(temp.data );
				if(temp.next != null){
					System.out.print(" -> ");
				}
				temp  = temp.next;
			
		
		}
		
		
		
	}
	
	
	
	
}
