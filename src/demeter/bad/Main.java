package demeter.bad;

public class Main {

    public static void main(String [] args){
        Car car = new Car("Mercedes",new Owner("Hansmann", new Address("Schulerstr",33, "45366", "Erlangen")), "Black");
        String streetOwner = car.getOwner().getAddress().getStreet();
        System.out.println("The Street of Owner is: " + streetOwner);
    }
}
