
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
            System.out.print("Height: ");
            height = input.nextInt();
        }while ((height<0) || (height>23));

        do {
            System.out.print("(c)onsole or (f)ile:");
            output_choice = input.next();
        }while (!((output_choice.equals("c")) || (output_choice.equals("f"))));

        MarioPrinter choice = (output_choice.equals("f")) ? new FilePrinter("out.txt") : new ConsolePrinter();

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



