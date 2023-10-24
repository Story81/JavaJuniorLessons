package lesson17;

public class Singer2 extends Thread {
    @Override
    public void run() {
        while (true) {

            try {
                synchronized (Monitors.MICROPHONE){
                    Monitors.MICROPHONE.notify();
                }
                synchronized (Monitors.MICROPHONE) {
                    Monitors.MICROPHONE.wait();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            for (int i = 0; i < 3; i++) {
                System.out.println("----------- FA");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROPHONE){
                Monitors.MICROPHONE.notify();
            }
        }
    }
}
