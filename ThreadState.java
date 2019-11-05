package Thread;

/**
 * @ClassName ThreadSate
 * @Description TODO
 * @Auther danni
 * @Date 2019/11/5 19:47]
 * @Version 1.0
 **/

public class ThreadState {
    private static class MyThread implements Runnable {
        @Override
        public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
    private static class method01 implements Runnable{

        @Override
        public void run() {
            while(true) {
                System.out.println("method1");
            }

        }
    }
    private static class methd02 implements Runnable{

        @Override
        public void run() {
            while(true){
            //Thread.yield();
            System.out.println("method2");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        /* MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
       ;while(thread.isAlive()) {
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());*/
        
        Thread thread1=new Thread(new method01());
        Thread thread2=new Thread(new methd02());
        thread1.start();
        thread2.start();
    }
}
