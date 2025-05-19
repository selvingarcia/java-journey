import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBooks {


    public static void main(String[] args) {

        ArrayList<Books> bookArray = new ArrayList<>();
        String name;
        int pages, year;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please introduce the book information");
        System.out.println("Like this, Title book, Pages, Publication year");
        while (true){
            System.out.println("Now introduce the book, if empty end loop");
            String details = sc.nextLine();
            if (details.isBlank())break;
            String[] array = details.split(",");
            if (array.length!=3){
                System.out.println("Please follow the rules!\n");
                continue;
            }
            name = array[0];
            pages = Integer.parseInt(array[1].trim());
            year = Integer.parseInt(array[2].trim());

            bookArray.add(new Books(name,pages,year));
        }
        System.out.println("What info will be printed?");
        String info = sc.nextLine();
        if (info.equalsIgnoreCase("everything")){
            for (Books obj: bookArray){
                System.out.println(obj);
            }
        } else if (info.equalsIgnoreCase("name")) {
            for (Books obj: bookArray){
                System.out.println(obj.getTitle());
            }
        }else {
            System.out.println("nothing will be printed");
        }


    }
}
