enum mobile{
    apple(20000),iqoo(50000),sumsung(20000),realme(20000);

    private mobile(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
}

class Main{
    public static void main(String[] args) {

        

        for(mobile phone : mobile.values()){
            System.out.println(phone);

        }
        
        mobile phone = mobile.apple;
        switch (phone) {
            case apple:
                System.out.println("Apple phone"+phone.getPrice());
                break;
            case iqoo:
                System.out.println("iqoo phone"+phone.getPrice());
                break;
            case sumsung:
                System.out.println("sumsung phone" + phone.getPrice());
                break;
            case realme:
                System.out.println("realme phone"+phone.getPrice());
        
            default:
                break;
        }
        
    }
}