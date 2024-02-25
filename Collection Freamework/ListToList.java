import java.util.*;
import java.util.List;

public class ListToList
{
	public static void main(String args[])
	{
		List<String>maleList = new ArrayList<String>();
	    
		maleList.add("Bhushan");
	    maleList.add("Piyush");
	    maleList.add("Kiran");
	    maleList.add("Piyush");
	    maleList.add("Hitesh");
	    maleList.add("Mayur");
	    maleList.add("Prashant");
		
		System.out.println("Size of male List:"+maleList.size());
		
		System.out.println("***** Male List *****");
		
		Iterator<String> male =maleList.iterator();
		
		while(male.hasNext())
		{
			System.out.println(male.next());
		}
		
		List<String> femaleList = new ArrayList<String>();
		femaleList.add("Manasi");
		femaleList.add("Rutuja");
		femaleList.add("Kalyani");
		
		System.out.println("\nSize of female List: "+femaleList.size());
		
		System.out.println("***** Female List*****");
		
		Iterator<String> female = femaleList.iterator();
		while(female.hasNext())
		{
			System.out.println(female.next());
		}
		
		List<String> classList = new ArrayList<String>();
		classList.add("Raja");
		classList.addAll(maleList);
		classList.addAll(femaleList);
		classList.add("Rani");
		
		System.out.println("\n Size of Class List:"+classList.size());
		
		System.out.println("***** class List*****");
		
		Iterator<String> list = classList.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
			list.remove();
		}
		}
		
		
	}
	
	
	
	