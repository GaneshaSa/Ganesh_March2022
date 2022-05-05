import java.util.Arrays;
import java.util.List;

class stack
{  int max=10;
  static int top1,top2;
int ar[]=new int [max];

 stack(){
	
	 top1=-1;
	 top2=10;
 }
 void push1(int key1){
	  if(top1+1==top2)
	  {
		  System.out.println("stack is overflow");
		  return;
	  }
	 top1++;
	 ar[top1]=key1;
	 	 
 }
 void push2(int key2)
 {
	 if(top1+1==top2){
		 System.out.println("stack is overflow");
		  return;
	 }
	 top2--;
	 ar[top2]=key2;
	 
 }	
 int popfirst(){
	 
	 if(top1<0){
		System.out.println("stack is under flow"); 
	 return 0;
	 }
	 int x=ar[top1--];
	 
	 return x;
	 	 
 }
	int popsecond(){
	 
	 if(top2>max-1){
		System.out.println("stack is over flow") ;
	 return 0;
	 }
	 int x=ar[top2++];
	 
	 return x;
	 	 
 }
		
	public static void main(String args[]){
      stack	s=new stack();	
	  
	  s.push1(5);
      s.push2(10);
      s.push2(15);
      s.push1(11);
      s.push2(7);
      s.push2(40);
	System.out.println("Popped element from stack1 is "+s.popfirst());
System.out.println("Popped element from stack2 is "+s.popsecond());


	
	}
	}