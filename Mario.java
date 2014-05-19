import java.util.Scanner;

/**
 * Created by Dana on 5/11/2014.
 */
public class Mario {


        public static void main (String[] args) {

            int height;


            while (true){
                System.out.println("Give me a number between 0 and 23 \n");
                Scanner in = new Scanner(System.in);

                height = in.nextInt();

                if ((height <= 1) || (height > 23))
                    System.out.println("ERROR Please enter a valid age\n");
                else
                    break;
            }



//          print spaces
            for (int i = 1; i <= height; i++) {
                //print spaces
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

}

