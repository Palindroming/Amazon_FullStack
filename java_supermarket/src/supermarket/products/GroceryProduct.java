package supermarket.products;

import java.util.ArrayList;

public class GroceryProduct {

    private String name;
    private double price;
    private double discount;


    public GroceryProduct(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getActualPrice() {
        return (1-discount)*price;
    }

    public String display(){
        return (
                "Name: "+ name+"\n"+"Price: "+ price+"\n"+"Discount: "+ discount


                );





    }

    public static void main(String[] args) {

        ArrayList<GroceryProduct> cart = new ArrayList<>();
        GroceryProduct toast = new GroceryProduct("Toast",1000,0.5);
        cart.add(toast);
        System.out.println(toast.getActualPrice());

    }





}
