package demeter.bad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Address {
    private String street;
    private int houseNumber;
    private String zipCode;
    private String city;
}
