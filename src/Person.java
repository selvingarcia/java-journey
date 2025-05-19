public class Person {

    public Person(String name, int age){
        this.name = name;
        this.age  = age;
    }

    public String toString(){
        return "The name of the person is " + name + " and age is " + age +" years";

    }

    public int getAge(){
        return this.age;
    }

    String name;
    int age;

}
