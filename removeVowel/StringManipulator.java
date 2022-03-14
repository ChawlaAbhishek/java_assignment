package removeVowel;
import java.util.Scanner;

public class StringManipulator {

    public String removeVowels(String input){
        if(input!=null){
            String newString = "";
            int s = input.length();
            for(int i =0;i<s-1;i++){
                if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u'){
                    newString=newString+"";
                }
                else{
                    newString+=input.charAt(i);
                }
            }
            return newString;
        }
        else{
            return null;
        }

    }

    public static void main(String[] args) {
        StringManipulator obj2 = new StringManipulator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a valid String");

        String input =sc.next();

        String result = obj2.removeVowels(input);

        System.out.println(result);








    }

}
