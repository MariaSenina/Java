package com.senina.maria.java.collections.set;

import java.util.Set;

public class SetExploration {
    public static void main(String[] args) {
        Set<String> set = Set.of("Apple", "Banana", "Cat");
        System.out.println("Original set: " + set);
    }
    //Set is immutable
    //Set does not allow for duplicate values
    //Set does not care about the position:
    // -> No indexes
    // -> The insert order is not respected

    //HASH TABLE:

    //Tries to combine:
    // -> the fixed positions (like an array)
    // -> the advantages of a LinkedList

    //Positions are called "buckets"
    //Elements are stored into "buckets" through the use of a hashing function.
    //Hashing function example -> mod 13
    // -> divide an element by 13, take the remainder and put the element in that place. I.e. 15 % 13 is 2 -> 2nd place
    //Advantages:
    // -> easy insertion
    // -> easy search
    // -> easy deletion
    //NOTE: the efficiency of your hash table will always depend on the efficiency of your hashing function

    //Implementation of the hashing function is always done through a hashcode() method
}
