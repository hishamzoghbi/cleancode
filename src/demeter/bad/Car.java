package demeter.bad;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String type;
    private Owner owner;
    private String color;
}
