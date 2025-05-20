package Part4Files;

public class PersonFile {

   private String name;
  private   int age;

    public PersonFile(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + " and my age is " + age;
    }
}
