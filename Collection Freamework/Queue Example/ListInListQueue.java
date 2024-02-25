import java.util.List;
import java.util.*;

public class ListInListQueue{
	public static void main(String args[])
	{
		//List<String> stringQueue = new ArrayList<String>();
		Stack<String> stack = new Stack<String>();
		stack.push("Bhushan");
		stack.push("Piyush");
		stack.push("Hitesh");
		stack.push("Tushar");
		stack.push("Amol");
		stack.push("Samir");
		stack.push("Harshal");
		stack.push("Bhushan");   //repeat pn acceapt hote
		stack.push("Piyush");
		stack.push(null);    //null value pn accept hote
		
		/*stack.pop("Bhushan");
		stack.pop("Piyush");
		stack.pop("Hitesh");
		stack.pop("Tushar");
		stack.pop("Amol");
		stack.pop("Samir");
		stack.pop("Harshal");*/
		
		System.out.println(stack.pop);
		
		//Queue<String> strQueue = new PriorityQueue<string>(stringQueue);
		
		Iterator<String> it=stack.iterator();
		while(it.hasNext()){
			//String s = it.next();
			System.out.println(it.next());
		}
		
		//Queue<String> strQueue = new PriorityQueue<string>(stringQueue);
		
		//Queue<String> stringQueue = new PriorityQueue<stringList>();
		
		/*stringList.forEach(String str : strQueue){
			System.out.println(str);
		}*/
	
	}
}