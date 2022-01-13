package com.senina.maria.java.javaTips.nestedClass;

public class NestedClassTest {
    int i;

    class InnerClass {
        //To create an instance of a regular nested class, we have to create an instance of the enclosing class

        public void someMethod() {
            i = 5;
        }
    }

    static class StaticNestedClass {
        //An instance of a static nested class can be created without creating an instance of the enclosing class
    }

    public static void main(String[] args) {
        // InnerClass innerClass = new InnerClass();
        StaticNestedClass staticNestedClass = new StaticNestedClass();

        InnerClass innerClass = new NestedClassTest().new InnerClass();
    }
}
