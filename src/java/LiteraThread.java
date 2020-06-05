class LiteraThread implements Runnable {
    private char LITERA;
    private static MonObject MON;
    private int SLEEP = 211;

    public LiteraThread(MonObject mon, int sleep) {
        LITERA = mon.getWaitLitera();
        MON = mon;
        SLEEP = sleep;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {

            //на занятии предлагал это, чтобы потоки срабатывали в неожиданный момент
            try {
                Thread.sleep(SLEEP);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (MON) {
                try {
                    while (MON.getWaitLitera() != LITERA) {
                        System.out.print('.'); //поток хотел бы но не стал
                        MON.wait();
                    }

                    System.out.print(LITERA);

                    MON.next();
                    MON.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
