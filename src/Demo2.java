
public class Demo2 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Pra24ee135n";
		//char[] ch = str.toCharArray();
		
		String s = str.replaceAll("[A-Za-z]","");
		
		
		//System.out.println(s);
		
		int i =Integer.parseInt(s);
		System.out.println(i);
				
		int sum=0;
		
		
		while(i>0)
		{
			int rem= i%10;
			sum=sum+rem;
			i=i/10;
		}
		System.out.println(sum);
		
	}

}
