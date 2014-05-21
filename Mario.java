import java.io.IOException;
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


            }
            else
                break;




//            File file = new File("mario.txt");
//            PrintWriter output = new PrintWriter(file);

            for (int i = 1; i <= height; i++) {
//            print spaces
                for (int s = height - i; s > 0; s--) {
                    System.out.print(" ");
//                    output.print(" ");
                }

//          print hashes
                for (int j = 0; j <= i; j++) {
                    System.out.print("#");
//                    output.print("#");

                }
                //print new_line
                System.out.print("\n");
//                output.print("\n");
            }
//            output.close();

        }


}

