package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

import java.util.Arrays;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("to jest wiersz leader",(poem) -> System.out.println(poem.indent(3)));
        poemBeautifier.beautify("to jest wiersz nadęty", (poem) -> System.out.println(poem.toUpperCase()));
        poemBeautifier.beautify("to jest wiersz garbaty", (poem) -> System.out.println(poem.replace("er","ER")
                .replace("rb","RB")));
        poemBeautifier.beautify("to jest wiersz ", (poem) -> System.out.println(poem + " echo! ".repeat(3)));
    }
}