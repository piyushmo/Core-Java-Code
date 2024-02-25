import java.util.*;

public class ArraToArrays{
	public int[] convertIntArrToArrayList(String string)
	{
		char[] list = string.toCharArray();
		int[] num = new int[list.length];
		System.out.println("Printing Array");
		for(int i=0 ; i<list.length ; i++)
		{
			System.out.println(num[i] = list[i] = '0');
		}
		return num;
	}
	public static void main(String args[])
	{
		ArraToArrays arrays = new ArraToArrays();
		int[] greeks = arrays.convertIntArrToArrayList("123456789456");
		System.out.println("converting array into list");
		
		List<Integer> integerList = new ArrayList<Integer>(greeks.length);
		
		for(Integer integer:greeks)
		{
			integerList.add(integer);
		}
		System.out.println("size of integerList="+integerList.size());
		System.out.println("value in list is :"+integerList);
		
		integerList.clear();
		System.out.println("size of integerList after clean()="+integerList.size());
		System.out.println("After clear "+integerList);
		
		integerList.add(1);
		integerList.add("Java");
		integerList.add('C');
		integerList.add(10.5);
		
		System.out.println("size" + integerList.size() + "value in list "+ integerList);
		
	}
}
		