package com.kodilla.rps;

import java.util.Random;

public class CompResponse {

    private int playerChoice;

    public CompResponse() {

    }
    public static int respond(String playerChoice) {
        int random = new Random().nextInt(1, 99);
        if (random < 34) {
            return 1;
        }
        else if (random < 67) {
            return 2;
        } else {
            return 3;
        }
    }
}