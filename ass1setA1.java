Accept ‘n’ integers from the user and store them in a collection. Display them in the sorted order. The collection should not accept duplicate elements. (Use a suitable 
collection). Search for an particular element using predefined search method in the Collection framework.
 
import java.io.*;
import java.util.*;

class ass1setA1
{
	public static void main(String args[]) throws Exception
	{
		int s=1,no,element,i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TreeSet ts=new TreeSet();
		System.out.println("Enter how many numbers you want:");
		no=Integer.parseInt(br.readLine());
		System.out.println("Enter "+no+" numbers:");
		for(i=0;i<no;i++)
		{
			element=Integer.parseInt(br.readLine());
			ts.add(element);
		}
		System.out.println("The elements in the sorted order:"+ts);


		while(s==1)
		{
			System.out.println("Enter the element to search:");
			element=Integer.parseInt(br.readLine());
			if(ts.contains(element))
				System.out.println("Element is found!");
			else
				System.out.println("Element not found!");
			System.out.println("Search Again?");
			s=Integer.parseInt(br.readLine());
		}
	}

}
