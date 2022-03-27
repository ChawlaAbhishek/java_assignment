package day15.multithreading;


class Raise implements Runnable{

    @Override
    public  void  run() {
        fun();

    }
    public synchronized void fun(){
        for(int i =0;i<10;i++){
            String resThread = Thread.currentThread().getName();
            System.out.println(resThread+"is implementing");


        }

    }
}

public class Multithread {


    public static void main(String[] args) {
        Raise r = new Raise();
        Thread a = new Thread(r);
        Thread b = new Thread(r);
        a.setName("abhisehk thread");
        b.setName("bobby thread");
        a.start();
        b.start();

    }
}

