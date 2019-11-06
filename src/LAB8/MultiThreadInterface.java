package LAB8;

class MultiThreadingInterface implements Runnable {
    @Override
    public void run() {
        //Current thread name
        System.out.println ("Thread running : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //creating multiple threads
            MultipleThread thread = new MultipleThread();
            thread.start();
        }
    }
}

