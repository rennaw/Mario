import java.io.*;

/**
 * Created by dana on 7/14/14.
 */
public class FilePrinter implements MarioPrinter{
    PrintWriter output = null;
    String filename;

    public FilePrinter(String f) {
        filename = f;
        try {

            // setup the file to redirect to
            File file = new File(filename);
            output = new PrintWriter(file);
            output.print(msg);
            output.close();



        } catch (IOException e) {
            // use the original output stream to output
            System.out.println("An I/O error occurred " + e.getMessage());
        } finally {
            if (output != null) {
                output.close();
            }
        }
    }

    public void print(StringBuilder msg) {
        System.out.print(msg);

    }
}