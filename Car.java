public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

   public Car(String make, double price, int year, String color){
        this.make=make;
        this.price=price;
        this.year=year;
        this.color=color;
    }
    public String getmake(){
        return this.make;
    }
    public double getprice(){
        return this.price;
    }
    public int getyear(){
        return this.year;
    }
    public String getcolor(){
        return this.color;
    }
    public void setmake(String make){
        this.make=make;
    }
    public void setprice(double price){
        this.price=price;
    }
    public void setyear(int year){
        this.year=year;
    }
    public void setcolor(String color){
        this.color=color;
    }
    
}