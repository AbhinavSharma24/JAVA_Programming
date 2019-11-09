package LAB8;

public class ThreadPriorities extends Thread {
    @Override
    public void run() {
        //Current thread name and priority
        System.out.println ("Thread running :: " + Thread.currentThread().getName()
                + " and Running Thread Priority :: " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        //creating two threads
        ThreadPriorities thread1 = new ThreadPriorities();
        ThreadPriorities thread2 = new ThreadPriorities();
        thread1.setPriority(Thread.MIN_PRIORITY);       //setting priorities
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();                                //starting threads
        thread2.start();

    }
}

