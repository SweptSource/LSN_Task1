package com.company;

public class Main {

    public static void main(String[] args) {

        if (args.length > 0) {
            Manager.processData(args[0]);
        }
    }
}
