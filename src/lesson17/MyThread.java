package lesson17;

public class MyThread extends Thread{
    @Override
    public void run() {
        for(int i=200; i<225;i++){
            System.out.println(i+" - "+Thread.currentThread().getName());
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
