public class MonObject {
    private char[] poolLiteras;// = {'A','B','C'};
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
