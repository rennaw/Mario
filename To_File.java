import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Owner on 5/21/2014.
 */
public class To_File extends Mario{

    public void File()throws IOException{
        File file = new File("mario.txt");
        PrintWriter output = new PrintWriter(file);
    }

}
