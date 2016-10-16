import java.util.Scanner;

import java.io.*;

class Node{
	int data;
	Node next;
	
	Node(int val){
		data = val;
		next = null;
	}
}

public class LinkedList1 {

	Node head = null; 
	

	public void push(int data){
		Node newNode = new Node(data);
		
		if(head == null){
			head = newNode;
		}
		else{
			
			Node temp = head;
			while(temp.next!=null){
				temp  = temp.next;
			}
			temp.next = newNode;
			newNode.next = null;
		
		}
	
	}
	
	public int count()
	{
		int c = 0;
		Node temp = head;
		
		if (head == null){
			return c;
		}
		else
		{	
			
			c = 1;
			while(temp.next!=null){
				c++;
				temp  = temp.next;
			
			}
			return c;
		}
		
		
	}
	
	public int find_nth(int n){
		
		int c = 1;
		Node temp = head;
		
		while(temp!= null){
			if (c == n){
				return temp.data;
			}
			c++;
			temp = temp.next;
			
		}
		
		assert(false);
		return 0;
	}
	
	public void deleteNode(int key){
		
		int c = 0;
		if(head == null){
			System.out.println("No nodes in list");
		}
		
		else{
			
			Node temp = head;
			
			while( temp!= null){
				
				if(temp.next.data == key){
					
					temp.next = temp.next.next;
					c = 1;
					break;
				}
				else{
					
					temp = temp.next;
					
				}
					
				
			}
			
			if (c == 0){
				System.out.println("No such data");
				
			}
		}
		
	}
	
	public void reverseLinkedList(){
		
		Node curr = head;
		Node nextNode;
		Node prev = null;
		
		while (curr != null)
		{
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
			
		}
		head=prev;
		Node temp = prev;
		while(temp!=null){
			
			System.out.print(temp.data );
			if(temp.next != null){
				System.out.print(" -> ");
			}
			temp  = temp.next;
		}
		
		
	}
	
	public void swapNodes(int x, int y){
		
		if( x == y)
			return;
		
		Node prevX = null, currX = head;
		
		while(currX != null && currX.data != x){
			
			prevX = currX;
			currX = currX.next;
			
		}
		
		
		
		Node prevY = null, currY = head;
		while(currY != null && currY.data != y){
			
			prevY = currY;
			currY = currY.next;
			
		}
		
		if(prevX != null){
			prevX.next = currY;
		}
		else{
			head = currY;
		}
		
		if(prevY != null){
			prevY.next = currX;
		}
		else{
			head = currX;
		}
		
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
		
	}
	
	public void print(){		
		Node temp = head;
		while(temp!=null){
			
			System.out.print(temp.data );
			if(temp.next != null){
				System.out.print(" -> ");
			}
			temp  = temp.next;
		}
	
	}
	
	public static void main(String args[]){
		
		
		int n;
		int ch,N;
		String c;
		Scanner in = new Scanner(System.in);
		LinkedList1 o = new LinkedList1();
		do{
		System.out.println(" ");
		System.out.println("**************************");
		System.out.println("1: Insert Data");
		System.out.println("2: Print List");
		System.out.println("3: Find Length");
		System.out.println("4: Get Nth");
		System.out.println("5: Delete item x");
		System.out.println("6: Reverse Linked List");
		System.out.println("7: Swap Nodes");
		System.out.println("8. Exit");
		System.out.println("**************************");
		ch  = in.nextInt();
		switch(ch){
		
			case 1:
					do{
						System.out.println("Enter the item:");
						n  = in.nextInt();
						o.push(n);
						System.out.println("press y to continue: ");
						c = in.next();
					}while((c.equalsIgnoreCase("y")));
					break;
			case 2:
					o.print();
					break;
			case 3:
					int count = o.count();
					System.out.println("Count is:");
					System.out.println(count);
					break;
			case 4:
					int x;
					System.out.println("Enter the position of the node you want");
					N = in.nextInt();
				    x = o.find_nth(N);
				    System.out.println("The Data at Position " + N + " is " + x );
				    break;
				    
			case 5:
					int x2;
					System.out.println("Enter the data to be deleted");
					x2 = in.nextInt();
					o.deleteNode(x2);
					break;
					
			case 6:
					System.out.println("Reverse Linked List is:");
					o.reverseLinkedList();
					break;
					
			case 7:
					int p, q;
					System.out.println(" Enter the two Node values to be swapped: ");
					p = in.nextInt();
					q = in.nextInt();
					o.swapNodes(p, q);
					break;
		
			case 8:	
					System.exit(0);
					
				
			default:
					System.out.println("Invalid choice:");
					break;
		}		
		}while(!(ch==8));
		
    }
	
}
