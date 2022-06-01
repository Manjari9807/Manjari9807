package practice;

public class missing {

	public static void main(String[] args) {
		boolean status=true;
		int a[]= {22,17,4,66,8,2,87};
		for(int j=1;j<=100;j++)
		{
		for(int i=0;i<a.length;i++) {
		if(j==a[i])
		{
		status=false;
		break;
		}
		}
		if(status==true)//number is not present
		{
		System.out.println(j);
		}
		status=true;//for every number status should be true
		} 
	}

}
