package demeter.clean;

import demeter.bad.Car;
import demeter.bad.Owner;
import demeter.bad.Address;

public class Main {
    public static void main(String[] args) {
       Car car;
        car = new Car("Mercedes GLB 350 AMG",
                new Owner("Hansmann Muster",
                        new Address("Laurenstr", 13, "35536", "Nürnberg")), "Black");
        Owner o = car.getOwner();
        LetterService.sendLetter(o, "Your Contract will be End in Three Days");
    }
}
