package com.senina.maria.java.abstractClassses;

public abstract class AbstractRecipe {
    public void execute() {
        setUp();
        prepare();
        cleanUp();
    }

    abstract void setUp();
    abstract void prepare();
    abstract void cleanUp();
}
