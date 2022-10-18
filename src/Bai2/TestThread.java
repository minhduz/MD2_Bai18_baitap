package Bai2;

public class TestThread {
    public static void main(String[] args)  {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();
        oddThread.start();
        try {
            oddThread.join();
        } catch (Exception e){
            System.out.println("Error");
        }
        evenThread.start();
    }
}
