public class Main{
    public static void main(String[] args) {
        Car Nissan= new Car("Nissan",58000,2021,"Red");

        Car Dodge= new Car("Ford",60000,2018,"pink");
        Nissan.setmake("tata");
        System.out.println(Nissan.getmake());
        System.out.println(Nissan.getprice());
        System.out.println(Nissan.getyear());
        Nissan.setcolor("black");
        System.out.println(Nissan.getcolor()+"\n");

        System.out.println(Dodge.getmake());
        System.out.println(Dodge.getprice());
        System.out.println(Dodge.getyear());
        System.out.println(Dodge.getcolor());
    }
}