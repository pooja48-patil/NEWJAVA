class product {
    String name;
    int price;

    
    public product(String name, int price) {
        this.name = name;
        this.price = price;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    
    public static void main(String[] args) {
        product p1 = new product("Car", 100000);
        p1.display();
    }
}
