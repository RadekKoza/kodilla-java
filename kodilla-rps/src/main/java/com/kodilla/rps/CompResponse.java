package com.kodilla.rps;

import java.util.Random;

import static com.kodilla.rps.WinningChoice.winnerlooserTab;

public class CompResponse {

    public CompResponse() {
    }

    public static int respond(int playerChoice) {
        int compWinner = -1;
        int compDraw = -1;
        int compLooser = -1;
        int compChoice = -1;

        for (int i = 0; i < winnerlooserTab.length; i++) {
            if (winnerlooserTab[i][1] == playerChoice) {
                compWinner = winnerlooserTab[i][0];
                compDraw = winnerlooserTab[i][1];
            }
            if (winnerlooserTab[i][0] == playerChoice) {
                compLooser = winnerlooserTab[i][1];
            }
        }

        int random = new Random().nextInt(1, 99);

        if (random < 50)
            compChoice = compWinner;
        else if (random < 75)
            compChoice = compDraw;
        else if (random < 100)
            compChoice = compLooser;

        return compChoice;
    }
}