package demeter.clean;

import demeter.bad.Address;

public class AddressService {
    public static String postalAddress(Address address){
        StringBuilder stringBuilder = new StringBuilder(address.getStreet());
        stringBuilder.append(" ");
        stringBuilder.append(address.getHouseNumber());
        stringBuilder.append("\n");
        stringBuilder.append(address.getZipCode());
        stringBuilder.append(",");
        stringBuilder.append(address.getCity());
        return stringBuilder.toString();
    }
}
