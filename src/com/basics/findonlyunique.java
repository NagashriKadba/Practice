package com.basics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class findonlyunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]={"Google","Facebook","Gmail","Google","Linkden"};
		
		Set<String> s1=new TreeSet<String>(Arrays.asList(arr));
		String abc[]=new String[s1.size()];
		Iterator itr=s1.iterator();
		int i=0;
		while(itr.hasNext())
		{
			abc[i++]=(String) itr.next();
		}
		System.out.println(Arrays.toString(abc));
		
		
		
	}

}
