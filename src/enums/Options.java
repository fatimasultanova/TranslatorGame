package enums;

public enum Options {
    EXIT("[0].Exit\n") , PLAY("[1].Play\n"),ADD("[2].Add\n"),SHOW("[3].Show\n");

       private final String val;

    public String getVal() {
        return val;
    }

    Options(String val) {
        this.val=val;
    }
}
