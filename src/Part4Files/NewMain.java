package Part4Files;

import java.util.ArrayList;

public class NewMain {
    public static void main(String[] args) {
        ArrayList<PersonFile> people = StoringRecords.recordsFromFile("list.txt");
        ArrayList<PersonFile> guest = StoringRecords.recordsFromFile("guest.txt");
        for (PersonFile obj: people){
            System.out.println(obj);
        }
        for (PersonFile obj: guest){
            System.out.println(obj);
        }
    }
}
