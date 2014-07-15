import java.io.*;

/**
 * Created by dana on 7/14/14.
 */
public class FilePrinter {
    public void print(String text) {
        File file = new File ("mario.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e1) {
                e1.printStackTrace();
                System.out.println("Could not find file");
            }
        }
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file.getAbsoluteFile()))){
                bf.write(text);
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

}
