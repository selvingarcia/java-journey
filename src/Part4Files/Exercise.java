package Part4Files;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("What song of adele would you like play?");
        System.out.println("Options: Rolling in the depp or Someone like you");
        String song = sc.nextLine();
        if (song.equalsIgnoreCase("Someone Like You")){
            someLikeYou();
        }
        else {
            deep();
        }

    }

    public static void someLikeYou(){
        try(Scanner sc = new Scanner(Paths.get("some.txt"))){
            while (sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void deep(){
        try(Scanner sc = new Scanner(Paths.get("deep.txt"))){
            while (sc.hasNextLine()){
                String row = sc.nextLine();
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
    }


}
