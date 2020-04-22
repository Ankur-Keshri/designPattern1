import java.util.*;
public class Pattern10 {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int mid = (n+1)/2;
		int i,j,k=0;
		
		for(i=1; i<=n; i++)
		{
		    if(i<=mid)
		    {
		        k++;
		    }
		    else{
		        k--;
		    }
		    for(j=1; j<=n; j++)
		    {
		        if(j<=mid+1-k ||j>=mid-1+k)
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		    }
		    System.out.println(" ");
		}
}
}
