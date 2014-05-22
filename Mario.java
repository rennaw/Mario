import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by Dana on 5/11/2014.
 */


public class Mario {




        public static void main (String[] args) throws IOException{

            int height, choice;




            while (true){
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

            if (choice == 1){
                for (int i = 1; i <= height; i++) {
//            print spaces
                    for (int s = height - i; s > 0; s--) {
                        System.out.print(" ");
                    }

//          print hashes
                    for (int j = 0; j <= i; j++) {
                        System.out.print("#");
                    }
                    //print new_line
                    System.out.print("\n");
                }

            }

            if (choice == 2) {


                File file = new File("mario.txt");
                PrintWriter output = new PrintWriter(file);

                for (int i = 1; i <= height; i++) {
//            print spaces
                    for (int s = height - i; s > 0; s--) {
                        output.print(" ");
                    }

//          print hashes
                    for (int j = 0; j <= i; j++) {
                        output.print("#");

                    }
                    //print new_line
                    output.print("\n");
                }
                output.close();
            }

        }


}

