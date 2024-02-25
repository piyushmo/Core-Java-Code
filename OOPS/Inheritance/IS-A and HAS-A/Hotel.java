class Business{                          //IS-A Relationship
	public void money(){
		System.out.println("Side income source");
	}
}
class Room{                               //HAS-A Relationship
	public void services(){
		System.out.println("1BHK ,2BHK");
	}
}
class Hotel extends Business{           // Child class extend parent class
	public static void main(String args[]){
		Hotel h = new Hotel();
		h.money();                    // parent chya method calling (IS-A)
		Room r = new Room();
		r.services();                 //HAS-A class method calling
	}
}