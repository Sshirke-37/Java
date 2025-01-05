Read a text file, specified by the first command line argument, into a list. The program should then display a menu which performs the following operations on the list: 
1. Insert line 
2. Delete line
3. Append line 
4. Modify line 5. Exit 
When the user selects Exit, save the contents of the list to the file and end the program. 

import java.io.*;
import java.util.*;

public class ass1setC1
{
	public static void main(String[] args)throws Exception
	{
		try
		{
			String filename=args[0];
			String line;
			BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
			LinkedList l=new LinkedList();
			FileReader f=new FileReader(filename);
			BufferedReader br=new BufferedReader(f);
			do
			{
				line=br.readLine();
				if(line==null)
					break;
				l.add(line);
			}while(true);
			br.close();
			do
			{
				System.out.println("1. Insert line");
				System.out.println("2. Delete line");
				System.out.println("3. Append line");
				System.out.println("4. Modify line");
				System.out.println("5. Exit");
				System.out.println("Enter your choice");
				int ch=Integer.parseInt(br1.readLine());
				switch(ch)
				{
					case 1:
						System.out.println("Enter the position");
						int po=Integer.parseInt(br1.readLine());
						System.out.println("Enter the Line");
						String line1=br1.readLine();
						l.add(po-1,line1);
						break;

					case 2:
						System.out.println("Enter the position");
						int po1=Integer.parseInt(br1.readLine());
						l.remove(po1-1);
						break;

					case 3:
						System.out.println("Enter the position");
						int po2=Integer.parseInt(br1.readLine());
						System.out.println("Enter the Line");
						String line2=br1.readLine();
						l.add(po2,line2);
						break;

					case 4:
						System.out.println("Enter the position");
						int po3=Integer.parseInt(br1.readLine());
						System.out.println("Enter the Line");
						String line3=br1.readLine();
						l.add(po3-1,line3);
						break;

					case 5:
						FileWriter fw=new FileWriter(filename);
						PrintWriter pr=new PrintWriter(fw);
						ListIterator i=l.listIterator();
						ListIterator i1=l.listIterator();
						while(i1.hasNext())
						{
						System.out.println(i1.next());
						}
						while(i.hasNext())
						{
							pr.println(i.next());
						}
						pr.close();
						System.exit(0);
						break;
				}
			}while(true);
		}
		catch(Exception e)
		{}
	}
}
