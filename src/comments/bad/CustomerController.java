package comments.bad;

public class CustomerController {

    /* */
    private String name;
    /** list of numbers*/
    private int number;

    //Get Method
    public String getName() {
        return name;
    }
    public int getNumber() {
        return number;
    }
    //Set Method
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String mapToString(){
        return name + "/" + number;
    }
    /**
    public CustomerController mapFromDatabase(){
        return new CustomerController();
    }
     */
}
