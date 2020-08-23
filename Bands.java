public class Bands {
    private String firstName;
    private String lastName;
    public Bands(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public void printFullName() {
        System.out.println (this.firstName+" "+this.lastName);
    }
}

