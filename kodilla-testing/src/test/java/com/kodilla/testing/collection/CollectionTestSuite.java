package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

@DisplayName("Odd numbers removing Test Suite")
class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When the list is empty then result should be: \"List is empty\"")
    @Test
    void testCaseEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> numbers = Arrays.asList();
        oddNumbersExterminator.exterminate(numbers);
        //Then
        Assertions.assertTrue(numbers.isEmpty());
    }

    @DisplayName("When the list isn't empty the function exterminate should return a list of all even values" )
    @Test
    void testCaseNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> numbers = Arrays.asList(11,12215,54,46,787,7,5,444,68);
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);
        List<Integer> expectedResult = Arrays.asList(54,46,444,68);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
