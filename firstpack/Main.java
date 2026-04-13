class Main{
    public static void main(String[] args) {
        A obj = new A() {
            //Anonymous class
            public void show(){
                System.out.println("Anonymous using interface");
                System.out.println("what is Inspirational Book for steve woznik");
            }
        };


        //lambda function
        
        Lambda obj1 = () -> System.out.println("steve woznik");

        obj.show();

        //return type
        B obj2 = (i,j)-> i+j; 

        obj1.inspirationalBook();
        int result = obj2.add(4, 5);

        System.out.println(result);
    }
}