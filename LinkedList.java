// insering node at last
import java.util.*;
class LinkList1{
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	void insertend(int value){
		Node newnode=new Node(value);
		if(head==null){
			head=newnode;
			return;
		}
		Node n=head;
		while(null!=n.next){
			n=n.next;
		}
		n.next=newnode;
	}
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		LinkList1 s1=new LinkList1();
		s1.head=new Node(10);
		Node second=new Node(20);
		Node third=new Node(30);
		Node fourth=new Node(40);
		
		s1.head.next=second;
		second.next=third;
		third.next=fourth;
		
		s1.insertend(n);
		
		
	}
}