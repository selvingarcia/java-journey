package Part4Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ObjectsFile {
    public static void main(String[] args) {
            String name;
         ArrayList<PersonFile> person = new ArrayList<>();

            int age;

            try(Scanner sc = new Scanner(Paths.get("list.txt"))){
                while (sc.hasNextLine()){
                    String line = sc.nextLine();
                    if(line.isBlank())continue;
                    String[] arrayList = line.split(",");
                    name = arrayList[0];
                    age = Integer.parseInt(arrayList[1].trim());
                    person.add(new PersonFile(name,age));
                }


            } catch (Exception e) {
                System.out.println("Error");
            }

        System.out.println("Total people are " + person.size());

    }
}
