package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> numbers1 = new ArrayList<Integer>();
        if (numbers.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("List to be checked: " + numbers);
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0)
                    numbers1.add(numbers.get(i));
            }
            System.out.println("The list after removing the odds: " + numbers1);
        }
        return numbers1;
    }
}
