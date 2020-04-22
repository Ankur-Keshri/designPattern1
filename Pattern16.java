import java.util.*;
public class Pattern16 {
	
	public static void main(String[] args) {
		
		int i,j,k;
		
		for(i=1; i<=6; i++)
		{
			k =1;
			for( j=1; j<=6; j++)
			{
				if(j<=i)
				{
					System.out.print(k);
					k=1-k;
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
