package lesson17;

public class Singer2 extends Thread {
    @Override
    public void run() {
        while (true) {

            try {
                synchronized (Monitors.MICROPHONE) {              // критическая зона. stringer2 спит
                    Monitors.MICROPHONE.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            for (int i = 0; i < 3; i++) {
                System.out.println("----------- FA");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROPHONE){            // критическая зона. разбудит singer1
                Monitors.MICROPHONE.notify();
            }
        }
    }
}
