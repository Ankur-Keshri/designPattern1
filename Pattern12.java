import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i,j;
		char ch;
		for(i=1; i<=n; i++)
		{
			ch = 'A';
			for(j=1; j<=(2*n-1); j++)
			{
				if(j>=n+1-i && j<= n-1+i)
				{
					System.out.print(ch);
					if( j<n )
					{
						
						ch++;
					}
					else 
					{
						ch--;
					}
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
