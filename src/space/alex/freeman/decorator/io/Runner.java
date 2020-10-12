package space.alex.freeman.decorator.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Runner {
    public static void main(String[] args) throws IOException {
        try (InputStream is = new LowerCaseInputStream(new FileInputStream("resources/text.txt"))) {
            int c;
            while ((c = is.read()) >= 0) {
                System.out.print((char) c);
            }
        }
    }
}
