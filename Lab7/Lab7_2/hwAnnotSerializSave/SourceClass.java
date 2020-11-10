package hwAnnotSerializSave;

public class SourceClass {

    @Save
    protected String s1 = "This is string to save \n";
    protected String s2 = "This string not to save \n";
    @Save
    protected int i1 = 7;
    protected int i2 = 9;
    @Save
    protected double d1 = 95d;
    protected double d2 = 200d;

    public String getS1() {
        return s1;
    }

    public SourceClass setS1(String s1) {
        this.s1 = s1;
        return this;
    }

    public String getS2() {
        return s2;
    }

    public SourceClass setS2(String s2) {
        this.s2 = s2;
        return this;
    }

    public int getI1() {
        return i1;
    }

    public SourceClass setI1(int i1) {
        this.i1 = i1;
        return this;
    }

    public int getI2() {
        return i2;
    }

    public SourceClass setI2(int i2) {
        this.i2 = i2;
        return this;
    }

    public Double getD1() {
        return d1;
    }

    public SourceClass setD1(Double d1) {
        this.d1 = d1;
        return this;
    }

    public Double getD2() {
        return d2;
    }

    public SourceClass setD2(Double d2) {
        this.d2 = d2;
        return this;
    }
}
