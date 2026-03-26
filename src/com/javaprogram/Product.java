package com.javaprogram;

public class Product {

    int Productid;
    String Productname;
    double price, quantity, discount,bill,discamt,saltax;
   

    
    public void setdata(int i, String pnm, double qnt, double pic, double dis, double sal) {
        Productid = i;
        Productname = pnm;
        quantity = qnt;
        price = pic;
        discount = dis;
        saltax = sal;
    }

    
    public void cal() {
        double totalprice = quantity * price;
        discamt = totalprice * discount / 100;
        double tax = totalprice * saltax / 100;
        bill = totalprice - discamt + tax;
    }

   
    public void display() {
        System.out.println("Product id: " + Productid);
        System.out.println("Product name: " + Productname);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);

        double totalprice = quantity * price;
        System.out.println("Total price: " + totalprice);

        System.out.println("----------------------------");
        System.out.println("Discount (%): " + discount);
        System.out.println("Discount amount: " + discamt);
        System.out.println("Tax (%): " + saltax);

        System.out.println("----------------------------");
        System.out.println("Final Bill: " + bill);
    }

    
    public static void main(String[] args) {

        Product a1 = new Product();

        a1.setdata(101, "Bag", 2, 500, 10, 5);

        a1.cal();

        a1.display();
    }
}
