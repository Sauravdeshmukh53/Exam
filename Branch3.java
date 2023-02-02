import java.util.*;
class Branch3{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Branch3 s1=new Branch3();
		s1.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		
		s1.head.next=second;
		second.next=third;
		third.next=fourth;
		
		
		
		
	}
}