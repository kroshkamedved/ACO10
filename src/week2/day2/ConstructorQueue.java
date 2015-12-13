package week2.day2;


public class ConstructorQueue {
    public static void main(String[] args) {
        C c = new C();
    }
}
class A{
    public A(){
        System.out.println("Inside A");
    }
}
class B extends A{
    public B(){
        System.out.println("Inside B");
    }
}
class C extends B{
    public C(){
        System.out.println("Inside C");
    }
}