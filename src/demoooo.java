import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class demoooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

			occurancestring("Naga Naga Maggie");
			
			
		}
		
		public static void occurancestring(String str)
		{
			HashMap<String,Integer> h1=new HashMap<String,Integer>();
			String arr[]=str.split(" ");
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=" ")
				{
					if(h1.containsKey(arr[i]))
					{
						h1.put(arr[i],h1.get(arr[i])+1);
					}
					else
					{
						h1.put(arr[i],1);
					}
				}
			}
		//	System.out.println(h1);
			Set<String> s1=h1.keySet();
			for(String abc:s1)
			{
			if(h1.get(abc)>1)
			{
				System.out.println(abc+"---------->"+h1.get(abc));
			}
			
		}
	}

}
