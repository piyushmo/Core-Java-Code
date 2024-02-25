import java.util.*;
class ListInListQueuePractice
{
	public static void main(String args[])
	{
		Queue<String> strQueue = new PriorityQueue<String>();
		 strQueue.add("Piyush");
		 strQueue.add("Bhushan");
		 strQueue.add("Tushar");
		 strQueue.add("Kiran");
		 strQueue.add("Hitesh"); 
		
		System.out.println("Size of strQueue is :"+strQueue.size());
		System.out.println("***** Male List *****");
		
		Iterator<String> it = strQueue.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Queue<String> femaleList = new LinkedList<String>();
		femaleList.add("Rutuja");
		femaleList.add("Manasi");
		femaleList.add("Mrunal");
		
		System.out.println("Size of femaleList is :" +femaleList.size());
        System.out.println("***** Male List *****");
          
        Iterator<String> female = femaleList.iterator();
        while(female.hasNext())
		{
			System.out.println(female.next());
		}
		
		Queue<String> classList = new LinkedList<String>();
		classList.add("Raj");
		classList.addAll( strQueue);
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