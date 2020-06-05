public class MonObject {
<<<<<<< HEAD
    private char[] poolLiteras;
=======
    private char[] poolLiteras;// = {'A','B','C'};
>>>>>>> src
    private int i;
    private char waitLitera;

    public MonObject(char[] poolLiteras) {
        this.poolLiteras = poolLiteras;
        waitLitera = poolLiteras[0];
        i = 1;
    }

    public void next(){
        waitLitera = poolLiteras[i];
        i = (i<poolLiteras.length-1)? ++i: 0;
    };

    public char getWaitLitera() {
        return waitLitera;
    }

    public int getSize() {
        return poolLiteras.length;
    }
}
