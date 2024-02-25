import java.util.*;

class ListToMap
{
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student1(101, "Piyush"));
		studentList.add(new Student1(102, "Prashant"));
		studentList.add(new Student1(103, "Tushar"));
		studentList.add(new Student1(104, "Hitesh"));
		studentList.add(new Student1(105, "Kiran"));
		studentList.add(new Student1(106, "Bhushan"));
		studentList.add(new Student1(107, "Rutuja"));
		studentList.add(new Student1(108, "Manasi"));
		
		System.out.println("\n****Printing Student Record****");
		Iterator<Student1> itStudentList = studentList.iterator();
		while(itStudentList.hasNext())
		{
			System.out.println("Student Record :" +itStudentList.next());
		}
		
		//Convert List To Map
		
		Map<Integer, String> recordList = new HashMap<>();
		for(Student stud :studentList)
		{
			recordList.put(stud.getRollNo(), stud.getStudentName())
		}
		for(Map.Entry<Integer,String> me : recordList.entrySet())
		{
		  System.out.println(getKey());
		  System.out.println(getValue());
		
	}