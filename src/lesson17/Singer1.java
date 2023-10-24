package lesson17;

public class Singer1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (true) {

            for (int i = 0; i < 2; i++) {
                System.out.println("LA -----------");
                try {
                    synchronized (Monitors.MICROPHONE) {
                        Monitors.MICROPHONE.notify();
                    }
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            count++;
            if (count > 4) {
                needStop = true;
            }
//            synchronized (Monitors.MICROPHONE){
//                Monitors.MICROPHONE.notify();
        }
    }
}

