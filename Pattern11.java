import java.util.*;
public class Pattern11 {
	
	public static void main(String[] args) {
		
		int i,j;
		
		for(i=1; i<=5; i++)
		{
			for(j=1; j<=9; j++)
			{
				if( j >=i && j<= 8-i)
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
