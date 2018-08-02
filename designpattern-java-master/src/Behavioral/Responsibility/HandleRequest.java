package Behavioral.Responsibility;

public class HandleRequest {
    private Handle small;
    private Handle middle;
    private Handle big;

    public HandleRequest(Handle small, Handle middle, Handle big) {
        this.small = small;
        this.middle = middle;
        this.big = big;
    }

    public Handle getRequestHandle(){
        small.setNextHandle2(middle).setNextHandle2(big);
        return small;
    }
}
