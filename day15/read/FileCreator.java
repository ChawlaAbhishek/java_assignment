package day15.read;

import java.io.File;
import java.io.IOException;

public class FileCreator {

    public static void main(String[] args) throws IOException {
       File f = new File("abc.text");
        System.out.println(f.createNewFile());

    }
}
