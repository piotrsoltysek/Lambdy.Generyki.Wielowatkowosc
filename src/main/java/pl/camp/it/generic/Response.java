package pl.camp.it.generic;

public class Response<TYP> {
    private int status;
    private String message;
    private TYP object;

    public TYP getObject() {
        return object;
    }

    public void setObject(TYP object) {
        this.object = object;
    }
}
