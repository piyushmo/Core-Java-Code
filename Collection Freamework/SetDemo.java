import java.util.*;

public class SetDemo {
	 public static <String> Set<String> convertListToSet(List<String> stringList)
    {
        // create an empty set
        Set<String> set = new HashSet<String>();
 
        // Add each element of list into the set
        for (String t : stringList)
            set.add(t);
 
        // return the set
        return set;
    }
	
	/*public void convertListToSet(List<String>ValuesSet){
		Set<String>StringSet = new HashSet<String>(ValuesSet);
		System.out.println("********Set***********");
		
		for(String valuesSet : StringSet) {
			System.out.println("Set Value :"+valuesSet);
		}
	}*/

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<String>();
		stringList.add("A");
		stringList.add("D");
		stringList.add("B");
		stringList.add("Z");
		stringList.add("C");
		stringList.add("A");
		stringList.add("D");
		stringList.add("E");
		
		System.out.println("********List***********\n");
		// Print the List
        System.out.println("List: " + stringList);
		
		// Convert List to stream
		Set<String> set = convertListToSet(stringList);
 
        // Print the Set
        System.out.println("Set from List: " + set +"\n");
		
		for(String strList :stringList) {
			System.out.println("List Value with Duplicate :"+strList);
		}
		
		SetDemo list = new SetDemo();
		list.convertListToSet(stringList);

	}

}
