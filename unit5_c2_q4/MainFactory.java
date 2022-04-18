package unit5_c2_q4;

import java.util.Scanner;

public class MainFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Note Demonantions");
        int Int = sc.nextInt();

        DemonationSizes demonationSizes = MyPaperFactory.createPaper(Int);
        System.out.println(demonationSizes.getSize());
    }
}
