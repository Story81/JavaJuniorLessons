package lesson17;

public class Main {
    public static void main(String[] args) {
        Thread.currentThread().setName("Главный");


        //создаем второй поток
        MyThread myThread = new MyThread();
        myThread.setName("Вася");
        myThread.start();

        Thread thread2 = new Thread(new MyThred2());
        thread2.setName("Коля");
        thread2.start();

        for(int i=0; i<10;i++){
            System.out.println(i+" - "+Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Thread описывает любой поток
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

