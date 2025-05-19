package Part4Files;

import java.nio.file.Paths;
import java.util.Scanner;

public class GuestList {

    private static String fileName;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce the file name");
        fileName = sc.nextLine();

        while (true){
            System.out.println("Please type the name, if blank end program");
            String nameList = sc.nextLine();
            if (nameList.isBlank())break;
            guestList(nameList.trim());
        }

        System.out.println("Thanks :) ");

    }

    public static void guestList(String name){

        try(Scanner sc = new Scanner(Paths.get(fileName))){
            while(sc.hasNextLine()){
                String list = sc.nextLine();
                if (list.equalsIgnoreCase(name)) {
                    System.out.println("Is in the list");
                    break;
                }else if(sc.hasNextLine()==false){
                    System.out.println("Is not in the list");
                }
            }

        } catch (Exception e) {
            System.out.println("error " + e.getMessage());
        }
    }

}
