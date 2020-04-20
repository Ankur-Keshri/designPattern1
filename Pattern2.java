import java.util.Scanner;

public class Pattern2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
       int  row = (2*n)-1;
        int i,j;
        for(i=1; i<=n; i++)
        {
            for(j=1; j<=row; j++)
            {
              if(j>= i && j<= row+1-i)
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


/*Enter the number
5
********* 
 *******  
  *****   
   ***    
    *     
*/