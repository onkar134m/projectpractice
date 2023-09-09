package introduction;

import java.util.ArrayList;

public class javaBasics {

	public static void main(String[] args) {
		
//		int[] a = {1,2,3,4,5,6,7,8};
//		for(int b:a)
//		{
//			if(b%2 == 0)
//			{
//				System.out.println(b);
//				break;
//			}
//			
//		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("Onkar");
		a.add("Lokhande");
		a.add("Lokhande");
	
		for(String b:a)
		{
			System.out.println(b);
		}
		
     	System.out.println("*************************");
     	
     	for(String b:a)
     	{
     		if(b.contains("Lokhande"))
     		{
     			System.out.println(b);
     			break;
     		}
     	}
     	
     	System.out.println("*************************");


	}

}
