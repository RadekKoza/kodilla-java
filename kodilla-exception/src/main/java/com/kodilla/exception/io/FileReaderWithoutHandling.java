package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {

    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("names.txt").getFile());
        Path path = Paths.get("tego-pliku-nie-ma.txt");//file.getPath()

        Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
        fileLines.forEach(System.out::println);
    }
}