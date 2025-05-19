package Part4Files;

import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFile {
    public static void main(String[] args) {

        String name, occupation;
        int age;

        try(Scanner sc = new Scanner(Paths.get("info.csv"))){
            while (sc.hasNextLine()){
                String letras = sc.nextLine();
                if (letras.isBlank())continue;
                String[] info = letras.split(",");
                name = info[0];
                age = Integer.parseInt(info[1]);
                occupation = info[2];

                System.out.println("Name " + name + " Age " + age + " years "+" Occupation " + occupation);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
