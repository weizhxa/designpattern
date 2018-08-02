package Structural.Bridge;

public abstract class AbstractStorage {
    protected ProtocolInterface protocal;

    public AbstractStorage(ProtocolInterface protocal) {
        this.protocal = protocal;
    }

    public abstract void connectServer();
}
