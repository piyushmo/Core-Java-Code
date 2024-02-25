import java.util.List;
import java.util.*;

public class ListInList{
	public static void main(String args[])
	{
		List<String> maleList = new ArrayList<String>();
		maleList.add("Bhushan");
		maleList.add("Piyush");
		maleList.add("Hitesh");
		maleList.add("Tushar");
		maleList.add("Amol");
		maleList.add("Samir");
		maleList.add("Harshal");
		
		System.out.println("Size of Male List :" +maleList.size());
		System.out.println("************** Male List Value**************");
		
		Iterator<String> it=maleList.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}