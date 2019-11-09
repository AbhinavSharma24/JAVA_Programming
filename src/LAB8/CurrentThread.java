package LAB8;

public class CurrentThread extends Thread {
    @Override
    public void run() {
        //Current thread name
        System.out.println("Current Thread name :: " +         Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        CurrentThread thread = new CurrentThread();
        thread.start();             //Starting the thread
    }
}

