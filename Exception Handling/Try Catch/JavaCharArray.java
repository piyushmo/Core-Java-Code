class JavaCharArray{
	public void displayArray(){
			
		char[] JavaCharArray = new char[5];
		
		 JavaCharArray[0] = 'J';
		 JavaCharArray[1] = 'A';
		 JavaCharArray[2] = 'V';
		 JavaCharArray[3] = 'A';
		
		 
		// char[] JavaCharArray = {'J','A','V','A'};
		 try{
		     for (int i=0 ; i<JavaCharArray.length ; i++){
		     System.out.println(JavaCharArray[i]);
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
			JavaCharArray a = new JavaCharArray();
             a.displayArray();			
		 
		 }
}
