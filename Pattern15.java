
public class Pattern15 {
	   
	public static void main(String[] args) {
		
		int i,j;
		char ch;
		for(i=1; i<=4; i++)
		{
			ch = '1';
			for(j=1; j<=7; j++)
			{
				if(j>=5-i && j<= 3+i)
				{
					if(j == 5 )
					{
						ch= 'A';
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
