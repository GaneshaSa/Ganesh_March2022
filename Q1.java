import java.util.Scanner;

class array{
	int x;
	int a;
	void insertionSort(int ar[]){
		int temp[];
		temp=ar;
		
		for(int i=ar.length-1;i>=0;i--){
			 x=ar[i];
			 System.out.println(x);
		for(int p=i-1;p>=0;p--)
		{ 
	
			if(ar[p]>x){
				
				a=x;
				x=ar[p];
				ar[p]=a;
				System.out.println(x);
			}
			
		}
		ar[i]=x;
		
	       for(int q=0;q<ar.length;q++){
			                              // if()
			               System.out.print(ar[q]+" ");
		                 }
	System.out.println("");
		}
				
		//display(temp);
	}
	
	
	
	
	
	public static void main(String args[]){
		array s=new array();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int max=sc.nextInt();
		int ar[]=new int[max];
		for(int i=0;i<max;i++){
		    ar[i]=sc.nextInt();	
			
		}
		s.insertionSort(ar);
		
		
		
	}
}