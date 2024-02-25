class Demo{
Demo(){
System.out.println("0-args constructor");
}
Demo(int a,int b){

System.out.println("value of a" +a+ " " +b);
}
}
class SuperDemo2 extends Demo{
SuperDemo2(){
super();
System.out.println("calling 0-args constructor in parent class ");
}
SuperDemo2(int a){
super(10,20);
System.out.println("calling -args constructor in parent class ");

System.out.println("value of a" +a);
}
public static void main(String args[]){
SuperDemo2 demo1 = new SuperDemo2();
SuperDemo2 demo2 = new SuperDemo2(30);
}
}