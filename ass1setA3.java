import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class ass1setA3
{
	public static void main(String[] args) throws Exception
	{
		int w=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Hashtable hm=new Hashtable();
		hm.put("Aishwarya",new Double(84.55));
		hm.put("Aish",new Double(75.65));
		hm.put("Aishu",new Double(90.02));
		hm.put("Rohini",new Double(65.35));
		hm.put("Yash",new Double(95.15));
		hm.put("Radhika",new Double(48.02));
		hm.put("Amruta",new Double(58.28));
		hm.put("Raj",new Double(78));
		hm.put("Rani",new Double(84));
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		System.out.println("Name      Percentage");
		while(i.hasNext())
		{
			Map.Entry me=(Entry)i.next();
			System.out.println(" "+me.getKey()+"       "+me.getValue());
		}
		while(w==1)
		{
			System.out.println("Enter the student name for searching:");
			String nm=br.readLine();
			Iterator i1=s.iterator();
			while(i1.hasNext())
			{
				Map.Entry me=(Entry)i1.next();
				if(nm.equalsIgnoreCase((String)me.getKey()))
					System.out.println("The percentage : "+me.getValue());
			}
			System.out.println("Search Again?");
			w=Integer.parseInt(br.readLine());
		}
	}
}
