package comments.clean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
    private String name;
    private int number;

    public String toString(){
        return name + "/" + number;
    }
}
