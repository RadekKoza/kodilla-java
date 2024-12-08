package com.kodilla.rps;

import java.util.List;

public class WinningChoice {
    static List<String> toolChoice = List.of("rock", "paper", "scissors");
    static int[][] winnerlooserTab = {{1, 0}, {2, 1}, {0, 2}};

    public WinningChoice() {
    }
    public static String getWinChoice(int choice1, int choice2) {
        List<Integer> competitors = List.of(choice1, choice2);
        String winningChoice = "";

        if (choice1 == choice2) {
            winningChoice = "no winner";
        }
        else {
            for (int i = 0; i < winnerlooserTab.length; i++)
                if (competitors.contains(winnerlooserTab[i][0]) && competitors.contains(winnerlooserTab[i][1]))
                    winningChoice = toolChoice.get(winnerlooserTab[i][0]);
        }
        return winningChoice;
    }
}