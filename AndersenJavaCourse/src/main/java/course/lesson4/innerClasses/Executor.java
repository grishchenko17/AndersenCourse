package course.lesson4.innerClasses;

public class Executor {
    public static void main(String[] args) {

        Payment.Purchase.Products milk = new Payment.Purchase.Products("Milk", 10);
        Payment.Purchase.Products tea = new Payment.Purchase.Products("Tea", 5);
        Payment.Purchase.Products coffee = new Payment.Purchase.Products("Coffee", 15);
        System.out.println(Payment.Purchase.Products.class);


        Park.Attraction attraction = new Park().new Attraction("Attraction ", "9.00 - 16.00", 1, 30);
        System.out.println(attraction.type + " " + attraction.price);

       Park.Address address = new Park().new Address("London, ", "Katowicka");
        System.out.println(address.city + address.street);

    }
}
