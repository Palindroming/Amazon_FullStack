package supermarket.products;

public class Beverage extends GroceryProduct {

    private sugarLevel sugarLevel;

    public Beverage(String name, double price, double discount, sugarLevel sugarLevel) {
        super(name, price, discount);
        this.sugarLevel = sugarLevel;

    }

    public sugarLevel getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(sugarLevel sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public String display(){

        return(super.display()+"\nSugar Level: "+sugarLevel);

    }





}
