import java.util.*;
public class Pattern6 {
	 public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number");
	        int n = sc.nextInt();
	       int  row = (2*n)-1;
	        int i,j,k=0;
	        for(i=1; i<=row; i++)
	        {
	           
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
	                  System.out.print(k);
	                 
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
