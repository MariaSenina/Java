package com.mycompany.java.Conditionals;

public class MyChar {

    //variables
    private char character;

    //constructor
    public MyChar(char character) {
        this.character = character;
    }

    //setter
    public void setCharacter(char character) {
        this.character = character;
    }

    //getter
    public char getCharacter() {
        return character;
    }

    //vowel check method
    public boolean isVowel() {
        if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return true;
        } else return character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U';
    }

    //number check method
    // char '0' = int 48 ; char '9' = int 57
    public boolean isNumber() {
        return character >= 48 && character <= 57;
    }

    //alphabet check method
    // char 'a' = int 97 ; char 'z' = int 122
    public boolean isAlphabet() {
        return character >= 97 && character <= 122;
    }

    //consonant check method
    public boolean isConsonant() {
        return isAlphabet() && !isVowel();
    }
}
