interface computer{
    String nameDev = "Dayakar"; // final and static
    int salDev= 19; // final and static
    void code();

}
class laptop implements computer
{
    public void code(){
        System.out.println("laptop");
    }
}
class Desktop implements computer{
    public void code(){
        System.out.println("Desktop");
    }
}
class Devloper{
    public void dev(computer comp){
        comp.code();

    }
}

public class Demo{
    public static void main(String a[]){
        computer com = new computer() {
            public void code(){   // anonymous class 
                System.out.println("No laptop/Desktop");
            }
        };
        computer obj = new Desktop();
        computer obj1 = new laptop();
        Devloper devl = new Devloper();
        devl.dev(com);


        System.out.println(computer.nameDev);  // we dont need an object
        System.out.println(computer.salDev); // we dont need an object
    }

}