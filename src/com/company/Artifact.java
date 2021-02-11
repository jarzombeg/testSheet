package com.company;

public class Artifact {
    // Write your code here
    int serial;
    String culture;
    int century;


    // with serial
    public Artifact(int serial) {
        this.serial = serial;

    }

    // with serial and culture
    public Artifact(int serial, String culture) {
        this.serial = serial;
        this.culture = culture;
    }

    // with serial, culture and century
    public Artifact(int serial, String culture, int century) {
        this.serial = serial;
        this.culture = culture;
        this.century = century;


    }

    public static void main(String[] args) {
// Write your code here
        Artifact aztecOne = new Artifact(212121);
        Artifact aztecTwo = new Artifact(212122, "Aztec");
        Artifact aztecThree = new Artifact(212123, "Aztec",12);

        System.out.println(aztecOne.serial);
        System.out.println(aztecTwo.serial + " " + aztecTwo.century);
        System.out.println(aztecThree.serial + " " + aztecTwo.culture + " " + aztecThree.century);


    }
}