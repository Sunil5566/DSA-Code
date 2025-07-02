import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("source.txt");
            FileOutputStream out = new FileOutputStream("destination.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }

            in.close();
            out.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
