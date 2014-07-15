import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Dana on 5/11/2014.
 */


public class Mario {


    public static final String POUND = "#";
    public static final String SPACE = " ";
    public static final String NEW_LINE = "\n";

    public static void main(String[] args) {

        int height, choice;


        while (true) {
            System.out.println("Give me a number between 0 and 23: ");
            Scanner in = new Scanner(System.in);

            height = in.nextInt();

            if ((height <= 1) || (height > 23))
                System.out.println("ERROR Please enter a valid number: ");
            else
                break;
        }

        System.out.println("Enter 1 to see results on console. Enter 2 if you want the results in a file.");
        Scanner result = new Scanner(System.in);
        choice = result.nextInt();

        MarioPrinter printer = null;
        if (choice == 1) {
            printer = new ConsolePrinter();
        } else {
            printer = new UpperCasePrinter();
        }
            for (int i = 1; i <= height; i++) {
//            print spaces
                for (int s = height - i; s > 0; s--) {
                    printer.print(SPACE);
                }

//          print hashes
                for (int j = 0; j <= i; j++) {
                    printer.print(POUND);
                }
                //print new_line
                printer.print(NEW_LINE);
            }

        }

    }


}

