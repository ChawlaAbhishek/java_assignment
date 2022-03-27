package day15.read;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadeer {
    public static void main(String[] args) throws IOException {
        File f = new File("abc.text");
        FileReader fr = new FileReader(f);

         char[] chr = new char[(int)f.length()];

         fr.read(chr);
         for(char c :chr){
             System.out.print(c);
         }

//        int i = fr.read();
//
//        while(i!=-1){
//            System.out.print((char) i);
//
//           i =  fr.read();
//        }


    }

}
