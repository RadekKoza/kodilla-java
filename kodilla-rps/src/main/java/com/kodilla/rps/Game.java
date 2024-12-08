package com.kodilla.rps;

import static com.kodilla.rps.Dialogs.*;

public class Game {
    static String player;
    static int numberOfRounds;
    static String roundWinner;
    static int playerWins;
    static int computerWins;
    static int drawNumber;
    static String theWinner;

    public void playGame() {
        player = getPlayerName();
        newGame();

        boolean end = false;

        while (!end) {
            String input = playInput();
            switch (input) {
                case "1":
                case "2":
                case "3": {
                    PlayRound playRound = new PlayRound(input);
                    roundWinner = playRound.getWinner();
                    if (roundWinner == player)
                        playerWins++;
                    else if (roundWinner == "computer")
                        computerWins++;
                    else
                        drawNumber++;
                    roundResult();

                    if (playerWins == numberOfRounds) {
                        theWinner = player;
                        finalResult();
                        end = whatNext();
                    }
                    else if (computerWins == numberOfRounds) {
                        theWinner = "computer";
                        finalResult();
                        end = whatNext();
                    }
                }
                break;
                case "n": {
                    boolean confirm = restartGame();
                    if (confirm) {
                        newGame();
                    } else {
                        backToPlay();
                    }
                }
                break;
                case "x": {
                    boolean confirm = endTheGame();
                    if (confirm)
                        end = true;
                    else {
                        backToPlay();
                    }
                }
                break;
                default:
                    keysToPlay();
                break;
            }
        }
    }
}