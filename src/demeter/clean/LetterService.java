package demeter.clean;
import demeter.bad.Owner;
public class LetterService {
    public static void sendLetter(Owner owner, String letter){
        String ownerName = owner.getName();
        String ownerAddress = AddressService.postalAddress(owner.getAddress());
        System.out.println("Letter to: " + ownerName + "\n" + ownerAddress);
        System.out.println("Letter:" + letter);
    }
}
