package unit5_c2_q4;

public class MyPaperFactory {

    public static DemonationSizes createPaper(int Int){
        if(Int==10){
            return  new s1();

        }
        else if(Int==100){
            return new s2();
        }
        else if(Int==1000){
            return new s3();
        }
        else
            return null;

    }
}
