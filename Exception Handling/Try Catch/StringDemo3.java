class StringDemo3{
	public static void main(String args[]){
		String string = new String();
		string = "Java Class";
		System.out.println(string);
		
		String name = "java";
		System.out.println(name);
		
		name = string;
		System.out.println("Value of name :"+name);
	}
}


string kay hai 
1.string is a non primative data type
2.string is a class
3.string is a Sequence of charecter

String madhe default interface astat
1.charSequence
2.Serialization
3.Comparable

String 3 Class madhe lihu shekto
1.class String
2.class StringBuffer
3.class StringBuilder

Two ways String che
1.String Literal
2.String Object

1.String Literal :-
                String name = "Java Class";
				1.runtime madhe memory create hote
				2.special memory madhe stored hote (String Constant pool)
				3.No Hashcode generated
		
2.String Object :-
                String string = new String();
				1.object create hoto
				2.heap memory madhe stored hote
				3.hashCode pn generate hoto
				4Immutable object hoto
				
Question:- What is Immutable?
Answare :- Unmodified or Unchanged
            (Username and Password)
			
// Code For String

class StringDemo{
	public static void main(String args[]){
		String string = new String(); // 1. String Object
		string ="Java Class";
		System.out.println(string);
		
		String name = "Java";
		System.out.println(name);
		
		name = string;
		System.out.println(name);
	}
}

//OUTPUT :- Java class
            Java
			Java Class
	
