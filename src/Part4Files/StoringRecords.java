package Part4Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static ArrayList<PersonFile> recordsFromFile(String file){
        ArrayList<PersonFile> people = new ArrayList<>();

        String name;
        int age;

        try(Scanner sc = new Scanner(Paths.get(file))){
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                if(line.isBlank())continue;
                String[] array = line.split(",");
                name = array[0];
                age = Integer.parseInt(array[1].trim());
                people.add(new PersonFile(name,age));



            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return people;
    }

}
