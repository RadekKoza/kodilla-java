package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Dialog dialog = new Dialog();
        dialog.intro();
        dialog.playInput();

        }
    }