public class Main {

    private final static MonObject mon = new MonObject(new char[]{'A','B','C'});
    private static final int[] sleep = {17, 23};

    public static void main(String[] args) {




        for (int i = 0; i < mon.getSize(); i++) {
            new Thread(
                    new LiteraThread(mon, sleep[i % 2])).start();
            mon.next();
        }
        System.out.println("START FROM " + mon.getWaitLitera());
    }
}
