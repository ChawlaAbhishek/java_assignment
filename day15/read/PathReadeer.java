package day15.read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathReadeer {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("abc.text");

        List<String> list = Files.readAllLines(p);

        for(String l:list){
            System.out.println(l);

        }


    }
}
