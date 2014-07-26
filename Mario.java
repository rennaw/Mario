
import java.util.Scanner;

/**
 * Created by Dana on 5/11/2014.
 */


public class Mario {


    public static void main(String[] args) {
        String output_choice;
        int height;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a height between 0 and 23: ");
            height = input.nextInt();
        }while ((height<0) || (height>23));

        do {
            System.out.print("(1) for console or (2) for file:");
            output_choice = input.next();
        }while (!((output_choice.equals("1")) || (output_choice.equals("2"))));

        MarioPrinter choice = (output_choice.equals("1")) ? new FilePrinter("mario.txt") : new ConsolePrinter();

        StringBuilder sb = new StringBuilder();

        for( int y = 0; y < height; y++) {
            for ( int x = height ; x > 0; x--) {
                if ((x-1)>y) {
                    sb.append(" ");
                }
                else {
                    sb.append("#");
                }
            }
            sb.append("#\n");
        }
        choice.print(sb);
    }
}



