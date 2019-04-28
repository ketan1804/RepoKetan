package abcdefg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapsPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> mp=new HashMap<String,String>();
Scanner sc1=new Scanner(System.in);
System.out.println("Enter your 5 set of userid's and pwd's");
for (int i=0;i<5;i++)
			{
	mp.put(sc1.next(),sc1.next());
			}
Set s11=mp.keySet();
Collection c=mp.values();
Iterator ite =s11.iterator();
while (ite.hasNext())
		{
	String s=(String) ite.next();
	System.out.println(s);
	System.out.println(mp.get(s));
		}
//System.out.println("The collection is printed below" + mp);
//System.out.println(mp);
sc1.close();
	}

}
