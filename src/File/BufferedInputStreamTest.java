package File;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamTest {

    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        BufferedInputStream bin = null;

        try {
            fin = new FileInputStream("example.txt");
            bin = new BufferedInputStream(fin);
            int i;
            while ((i = bin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            bin.close();
            fin.close();
        }
    }
}

