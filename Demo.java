

abstract class car{
    abstract void drive(); //abstract method declaration
    public void playMusic(){
        System.out.println("playing music"); //non abstract method
    }

}
class Audi extends car{
    public void drive(){
        System.out.println("driving audi");
    }
}
class Demo{
    public static void main(String a[]){
        car c = new Audi();
        c.drive();
        c.playMusic();
    }
}