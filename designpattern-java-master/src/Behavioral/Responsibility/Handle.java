package Behavioral.Responsibility;

public abstract class Handle {
    protected Handle nextHandle;

    public void setNextHandle(Handle handle){

        this.nextHandle = handle;
    }

    public Handle setNextHandle2(Handle handle){
        this.nextHandle = handle;
        return nextHandle;
    }

    public abstract void check(int number);
}
