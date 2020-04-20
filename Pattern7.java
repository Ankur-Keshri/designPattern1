import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n = sc.nextInt();
	   int  row = (2*n)-1;
	    int i,j,k=0,x;
	   
	    for(i=1; i<=row; i++)
	    {
	      x=1;
	       if(i<=n)
	       {
	           k++;
	       }
	       else{
	           k--;
	       }
	        for(j=1; j<=n; j++)
	        {
	          if(j>= n+1-k)
	          {
	              System.out.print(x);
	              x++;
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
