import java.util.*;
public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int row = (2*n-1)/2;
		int i,j,k =0;
		
		for(i=1; i<=(2*n-1); i++)
		{
		    if(i<=row)
		    k++;
		    else
		    k--;
		    for(j=1; j<=n; j++)
		    {
		        if(j<=k)
		        System.out.print("*");
		        else
		        System.out.print(" ");
		    }
		    System.out.println(" ");
		}
		
		
	}

}
