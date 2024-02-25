import java.util.*;
class ListInListPractice
{
	public static void main(String args[])
	{
		List<String> maleList = new ArrayList<String>();
		maleList.add("Piyush");
		maleList.add("Bhushan");
		maleList.add("Tushar");
		maleList.add("Kiran");
		maleList.add("Hitesh\n");
		
		System.out.println("Size of maleList is :"+maleList.size());
		System.out.println("***** Male List *****");
		
		Iterator<String> it = maleList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		List<String> femaleList = new ArrayList<String>();
		femaleList.add("Rutuja");
		femaleList.add("Manasi");
		femaleList.add("Mrunal\n");
		
		System.out.println("Size of femaleList is :" +femaleList.size());
        System.out.println("***** Male List *****");
          
        Iterator<String> female = femaleList.iterator();
        while(female.hasNext())
		{
			System.out.println(female.next());
		}
		
		List<String> classList = new ArrayList<String>();
		classList.add("Raj");
		classList.addAll(maleList);
		classList.addAll(femaleList);
		classList.add("Simran");
		
		System.out.println("Size of Class"+classList.size());
		System.out.println("*****  Class List Print *****");
		
		Iterator<String> list = classList.iterator();
		while(list.hasNext()){
			System.out.println(list.next());
		}	
	}
}