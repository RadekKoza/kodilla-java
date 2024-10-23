package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.Arrays;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify(() -> System.out.println("wiersz leader".indent(3)));
        poemBeautifier.beautify(() -> System.out.println("wiersz nadęty".toUpperCase()));
        poemBeautifier.beautify(() -> System.out.println("wiersz garbaty".replace("er","ER")
                .replace("rb","RB")));
        poemBeautifier.beautify(() -> System.out.println("wiersz " + "echo! ".repeat(3)));
    }
}