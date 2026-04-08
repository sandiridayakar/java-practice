package innerclass;

public class A {

    int age;
    public void car(){
        System.out.println("car is audi");
    }
    
    public class B{
        public void carEngine(){
            System.out.println("v8 engine");
        }
    }
}
