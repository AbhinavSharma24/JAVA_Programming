package LAB8;

public class MultipleThread extends Thread {
    @Override
    public void run() {
        //Current thread name
        System.out.println("Thread running : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultipleThread thread = new MultipleThread();     //creating multiple threads
            thread.start();
        }
    }
}

