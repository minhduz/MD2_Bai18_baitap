package Bai1;

public class NumberGenerator implements Runnable{
    private Thread myThread;

    public NumberGenerator() {
        myThread = new java.lang.Thread(this, "my runnable thread");
        System.out.println("my thread created" + myThread);
        myThread.start();
    }

    public java.lang.Thread getMyThread() {
        return myThread;
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println("Printing the count " + i);
                java.lang.Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("my thread interrupted");
        }
        System.out.println("my thread run is over");
    }

    public void start() {
        System.out.println("Starting " + myThread);
        if (myThread == null) {
            myThread = new Thread();
            myThread.start();
        }
    }
}
