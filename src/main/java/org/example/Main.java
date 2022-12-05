package org.example;
import notorg.example.NotOrgClass;

public class Main {
    public static void main(String[] args) {


        NotMain thing1 = new NotMain();
        System.out.println(thing1.myThing);
        NotOrgClass thing2 = new NotOrgClass();
        System.out.println(thing2.myThing);
    }

    public class tree extends NotOrgClass {
        public tree() {
            super();
            System.out.printf(super.myThing);
        }
    }
}