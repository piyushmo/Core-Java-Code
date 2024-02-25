class JavaArray{
	public void array(){
		char[] JavaArray = new char[5];
		
		JavaArray[0]= 'J';
		JavaArray[1]= 'A';
		JavaArray[2]= 'V';
		JavaArray[3]= 'J';
		
		try{
			for(int i=0 ; i<JavaArray.length ; i++){
				System.out.println(JavaArray[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
		public static void main(String args[]){
			JavaArray ar = new JavaArray();
			ar.array();
		}
}