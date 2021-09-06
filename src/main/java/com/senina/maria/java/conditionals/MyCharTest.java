package com.mycompany.java.Conditionals;

public class MyCharTest {

    public static void main(String[] args) {

        MyChar myChar = new MyChar('d');

        System.out.println(myChar.isVowel());

        System.out.println(myChar.isNumber());

        System.out.println(myChar.isAlphabet());

        System.out.println(myChar.isConsonant());
    }
}
