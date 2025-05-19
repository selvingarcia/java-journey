package Part4Files;

import java.nio.file.Paths;
import java.util.Scanner;

public class GuestList2 {

    private static String fileName;
    private static String nameSearch;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    while (true){
        System.out.println("Type the name of the file");
        fileName = sc.nextLine();
        System.out.println("Search for: ");
        nameSearch = sc.nextLine();

        files(fileName.concat(".txt"), nameSearch);
        if (nameSearch.isBlank())break;

    }
        System.out.println("End program");

    }

    public static void files(String pathName, String name){
        boolean found = false;
        try(Scanner sc = new Scanner(Paths.get(pathName))) {
            while(sc.hasNextLine()) {
                String row = sc.nextLine();

                if (name.equalsIgnoreCase(row.trim()))
                {System.out.println("Found " + row);
                    found = true;
                }

            }
            if (!found) System.out.println("Not found");
        } catch (Exception e) {
            System.out.println("Reading the file " + pathName+ " Failed");
        }
    }



}
