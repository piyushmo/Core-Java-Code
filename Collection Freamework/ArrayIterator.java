import java.util.*;

class ArrayIterator{
	public static void main(String args[])
	{
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("c++");
		list.add("Core java");
		list.add("HTML");
		list.add("JavaScript");
		
		try{
		for (String i : list){
			list.remove(i);
			System.out.println(i);
		}
		}catch(ConcurrentModificationException e){
			e.printStackTrace();
		}
		
		Iterator<String> it =list.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
			it.remove();
		}
	}
}