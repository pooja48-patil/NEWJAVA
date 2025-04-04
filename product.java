class product {
    String name;
    int price;
    strnt quantity;

    
    public product(String name, int price) {
        this.name = name;
        this.price = price;
        this.quantity=quantity;
    }


    void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("quantity: " + quantity);


    }

    
    public static void main(String[] args) {
        product p1 = new product("Car", 100000,"good");
        p1.display();
    }
}
