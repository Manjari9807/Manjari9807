package BalaSan;

public class AlternateSorting {
   public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7};
	 int n=a.length;
	 int a1[]=new int[n];
	 boolean flag=true;
	 int low=0,high=a.length-1;
	 for(int i=0;i<a.length;i++)
	 {
		 if(flag)
		 {
			 a1[i]=a[high--];       //true
		 }
		 else
		 {
			 a1[i]=a[low++];	   //false	 
		 }
		 if(flag)
		 {  
			 flag=false;           //false
		 }
		 else
		 { 
			 flag=true;           //true
		 }
	 }
	 for(int i=0;i<a1.length;i++)
	 {
		 a[i]=a1[i];
	 }
	 for(int i=0;i<a.length;i++)
	 {
		 System.out.print(a[i]+ " ");
	 }
   }
}
