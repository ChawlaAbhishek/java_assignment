package day15.read;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReadeer {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("abc.text"));
        String line = bf.readLine();

        while (line!=null){
            System.out.println(line);
            line =bf.readLine();
        }
        bf.close();

    }
}
