import java.util.Scanner;

public class Pattern8 {
	  public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number");
		    int n = sc.nextInt();
		   int  row = (2*n)-1;
		    int i,j,k,x=0;
		   
		    for(i=1; i<=row; i++)
		    {
		       
		       if(i<=n)
		       {
		    	   k=n+1-i;
		    	   x++;  
		       }
		       else
		       {
		    	  k=i-(n-1); 
		    	   x--; 
		       }
		    	   
		        for(j=1; j<=n; j++)
		        {
		          if(j>= n+1-x)
		          {
		              System.out.print(k);
		              k++;
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
