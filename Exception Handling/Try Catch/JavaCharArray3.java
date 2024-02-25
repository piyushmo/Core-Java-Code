class JavaCharArray3{
	public void displayArray(){
			
		    char[] JavaCharArray = new char[10];
		
		 JavaCharArray[0] = 'J';
		 JavaCharArray[1] = 'A';
		 JavaCharArray[2] = 'V';
		 JavaCharArray[3] = 'A';
		
		 
	
		 try{ 
			 if (JavaCharArray != null){
		     for (shar c:JavaCharArray){
		     System.out.println(c);
		    }
		 }
		 
		 catch(ArrayIndexOutOfBoundsException e){
		    System.out.println(e);
		 }
		  catch(Exception e){
		    System.out.println(e);
		 }
}
		 
		/* for (int i=0 ; i<5 ; i++){
		 System.out.println(JavaCharArray[i]);
		 }
		 
		 for (int i=0 ; i<4 ; i++){
		 System.out.println(JavaCharArray[i]);
		 } */
		 
		 public static void main(String args[]){
			JavaCharArray3 a = new JavaCharArray3();
             a.displayArray("Piyush");			
		 
		 }
}
