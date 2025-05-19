import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<TelevisionProgram> listPrograms = new ArrayList<>();

        System.out.println("Television Filter");
        while (true){
            System.out.println("Please enter Name Television Program, Duration , leave blank code terminates");
            String details = sc.nextLine();
            if (details.isBlank())break;
            String[] tv = details.split(",");
            if (tv.length !=2) {
                System.out.println("You Should put first Television name , Duration");
                continue;
            }
            String program = tv[0].trim();
            int duration = Integer.parseInt(tv[1].trim());
            listPrograms.add(new TelevisionProgram(program, duration));
        }

        for (TelevisionProgram obj: listPrograms){
            System.out.println(obj);
        }

        System.out.println("Enter the maximun duration of the program");
        int time = Integer.parseInt(sc.nextLine());

        for (TelevisionProgram obj: listPrograms){
            if (obj.getDuration()<=time) System.out.println(obj);
        }



    }
}