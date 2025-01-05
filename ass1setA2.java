Construct a linked List containing names of colors: red, blue, yellow and orange. Then extend your program to do the following:  
i.Display the contents of the List using an Iterator;  
ii. Display the contents of the List in reverse order using a ListIterator;  
iii. Create another list containing  pink and  green. Insert the elements of this list between blue and yellow.  

import java.util.*;
public class ass1setA2
{
	public static void main(String args[])
	{
		LinkedList t=new LinkedList();
		t.add("Red");
		t.add("Blue");
		t.add("Yellow");
		t.add("Orange");
		Iterator i=t.iterator();
		System.out.println("Elements:");
		while(i.hasNext())
			System.out.println(i.next());
		ListIterator i1=t.listIterator();
		System.out.println("\n");
		while(i1.hasNext())
			i1.next();
		System.out.println("Elements in reversed order:");
		while(i1.hasPrevious())
			System.out.println(i1.previous());
		System.out.println("\n");
		LinkedList t1=new LinkedList();
		t1.add("Pink");
		t1.add("Green");
		i=t1.iterator();
		t.add(2,i.next());
		t.add(3,i.next());
		Iterator i2=t.iterator();
		System.out.println("Total Elements:");
		while(i2.hasNext())
			System.out.println(i2.next());
	}
}

