package DesignPatternTest.BuilderPattern;

public abstract class Coffee implements Item {

    @Override
    public Packing packing() {
        return new Cup();
    }

    @Override
    public abstract float price();
}
