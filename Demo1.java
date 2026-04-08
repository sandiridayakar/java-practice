class A{
    public void Show(){
        System.out.println("A Class");
    }
}


public class Demo1 {
    public static void main(String a[]){
        A obj = new A(){
            public void Show(){
        System.out.println("Anonymous Class");
    }
        };
        obj.Show();

    }
}
