import java.util.*;
public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int i,j;
		char ch;
		for(i=1; i<=n; i++)
		{
			ch = 'A';
			for(j=1; j<=2*n; j++)
			{
				if(j>=n+1-i && j<=n+i)
				{
					if(j==n+1)
					{
						ch ='1';
					}
					System.out.print(ch);
					ch++;
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
