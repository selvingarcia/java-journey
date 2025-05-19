public class PersonalInformation {

    private String firstName="", lastName="";
    private int id=0;
    public PersonalInformation(String firstName, String lastName, Integer id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String toString(){
        return firstName+ " " + lastName;
    }

}
