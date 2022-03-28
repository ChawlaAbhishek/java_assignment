package u4c4q1;

public class Threade {



    // to overcome race condition we apply synchronized keyword which is only the reason for deadlock.
    // deadlock is nothing but lock without key.


    //for example

//    class Abhishek {
//        public synchronized void funA(Bobby b){
//            System.out.println("funA of Abhishek running");
//            b.fun2();
//            System.out.println("funA of Abhishek ended");
//        }
//        public synchronized void fun1(){
//            System.out.println("inside fun1 of Abhishek");
//        }
//    }
//    class Bobby {
//        public synchronized void funB(Abhishek a){
//            System.out.println("funB of Bobby running");
//            a.fun1();
//            System.out.println("funB of Bobby ended");
//        }



}
