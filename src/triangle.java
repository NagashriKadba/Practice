
public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int space=3;
		int line=4;
		int mid=line;
		for(int i =0; i<=line;i++)
		{
		for(int k=0;k<=space;k++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=line;j++)
		{	
			
			
			
			
			char ch = 'D';
			if(j<=mid)
			{
				System.out.print((char)(ch-line+i));
			}
			else
			{
				System.out.print((char)(ch+i));
		}
	
		}
		System.out.println();	
		space--;
	}
	}
}
