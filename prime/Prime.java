package com.prime;


public class Prime {

    public static boolean  isPrime(int a){

        if(a < 2) {
            return false;
        }
        else{
            for(int i=2; i<a; i++){
                if(a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public int[] findprime(int[] inputArray){
        int count = 0;
        for(int i=0;i<inputArray.length;i++){
            if(!isPrime(inputArray[i])){
                inputArray[i] = 0;
            }else
                count++;
        }
        int[] outputArray = new int[count];
        int upper = -1;
        for(int a:inputArray){
            if(a!=0)
                outputArray[++upper] = a;
        }
        return outputArray;
    }
    public static void main(String[] args){
        Prime obj = new Prime();
            int[] arr = {10,12,5,50,11,14,15};
     //   int[] arr = {10,12,7};
        int [] ans = obj.findprime(arr);
        if(ans.length==0)
            System.out.println("Sorry, No Prime number in the Array");
        else{
            for(int primeNo: ans)
                System.out.print(primeNo+" is your Prime Number");
        }
    }
}
