import java.util.*;
public class Pattern9 {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		int i,j;
		
		for(i=1; i<=n; i++)
		{
		    for(j=1; j<=n; j++)
		    {
		        if(j==i || j==n+1-i)
		        {
		            System.out.print(" ");
		        }
		        else
		        {
		            System.out.print("*");
		        }
		    }
		    System.out.println(" ");
		}
}
}
