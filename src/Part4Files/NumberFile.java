package Part4Files;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberFile {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        int counter=0;
        System.out.println("Lower Bound");
        int numLow  = Integer.parseInt(scanner.nextLine());
        System.out.println("Upper Bound");
        int numUp  = Integer.parseInt(scanner.nextLine());
        try(Scanner sc = new Scanner(Paths.get("numbers1"))){
                while (sc.hasNextLine()){

                    String nums = sc.nextLine();
                    if (nums.isBlank())continue;
                    int num = Integer.parseInt(nums);

                    if (num>=numLow && num<=numUp)
                    {
                        counter++;
                        numList.add(num);
                    }

                }
            System.out.println("Total numbers in range is " + counter);
            System.out.println("And the numbers are: ");
            for (Integer obj: numList){
                System.out.println(obj);
            }
            }//end try
            catch (Exception e) {
                System.out.println("error ");
            }

    }
}
