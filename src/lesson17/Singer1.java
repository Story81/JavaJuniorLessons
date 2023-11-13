package lesson17;

public class Singer1 extends Thread {
    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop) {

            for (int i = 0; i < 2; i++) {
                System.out.println("LA -----------");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            synchronized (Monitors.MICROPHONE) {         //критическая зона. singer2 разбудили
                Monitors.MICROPHONE.notify();
            }

            try {
                synchronized (Monitors.MICROPHONE) {
                    Monitors.MICROPHONE.wait();
                }                                            //критическая зона.  сами заснули
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            if (count > 4) {
                needStop = true;
            }
        }
    }
}

