
import java.util.Scanner;
class linkedlist
{  Node head;
      static class Node{
		  int data;
		  Node next;
		  Node(int d){
			  this.data=d;
			  this.next=null;
		  }
		   
	  }
	  
	  void insertatfirst(int key)
	  {  Node new1=new Node(key);
	  
		 if(head==null){
			 new1=head;
			 return;
		 }
		 new1.next=head;
		  head=new1;
		  
	  }
   
	void display(){
		Node n=head;
		while(n!=null){
			System.out.print(n.data+" ");
			n=n.next;
		}
		
		
	}
	
	public static void main(String args[]){
	linkedlist ok=new linkedlist();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the test case number ");
int y=sc.nextInt();
System.out.println("Enter the number of elements in linked list ");
int number=sc.nextInt();

System.out.println("Enter the first element value ");
int x=sc.nextInt();	
ok.head=new Node(x);
for (int i=2;i<=number;i++){
	System.out.println("Enter the "+i+" element value ");
int w=sc.nextInt();
ok.insertatfirst(w);
	
}

System.out.println("Here is your reverse linked list");

ok.display();		
		
		
	}
}