
public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String str = "ABC";
		        int n = str.length();
		      //  Permutation permutation = new Permutation();
		        permute(str, 0, n-1);
		    }
		 
		   static void permute(String str, int l, int r)
		    {
		        if (l == r)
		            System.out.println(str);
		        else
		        {
		            for (int i = l; i <= r; i++)
		            {
		                str = swap(str,l,i);
		                permute(str, l+1, r);
		            }
		        }
		    }
		 
		    /**
		     * Swap Characters at position
		     * @param a string value
		     * @param i position 1
		     * @param j position 2
		     * @return swapped string
		     */
		    public static String swap(String a, int i, int j)
		    {
		        char temp;
		        char[] charArray = a.toCharArray();
		        
		        temp = charArray[i] ;
		        charArray[i] = charArray[j];
		        charArray[j] = temp;
		   //     System.out.println("Value is:" + String.valueOf(charArray));
		        return String.valueOf(charArray);
		    }

}
