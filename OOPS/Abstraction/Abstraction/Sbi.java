class Sbi extends Bank{                                           // Child extends parent class IS-A Relationship
		public void time(){                                      //Abstract class body declare
			System.out.println("SBI-Open Time,Lunch Time, Close Time");
		}
		public void uniform(){
			System.out.println("SBI- Uniform Diffrent Colors");
		}
		public void idCardD(){
			System.out.println("SBI- ID Card Design");
		}
		public void location(){
			System.out.println("SBI- Dffrent location");
		}
		public static void main(String args[]){         // main method 
			Sbi s = new Sbi();                         //Object create new keyword refrence variable
			s.deposit();                              //parent class chya concrete method la call kel aahe
			s.withdraw();
			s.acOpen();
			s.time();                              //Abstract method la call kel
			s.uniform();
			s.idCardD();
			s.location();
		}
	}