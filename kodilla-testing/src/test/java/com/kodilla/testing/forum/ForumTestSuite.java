package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
class ForumTestSuite {                                         // [5]
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

    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )
    @Test
    void testCaseRealName() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assertions.assertEquals("John Smith", result);
    }

    @DisplayName("When created SimpleUser with name, " +
            "then getUsername should return correct name")
    @Test                                                       // [6]
    void testCaseUsername() {                                   // [7]
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");  // [8]

        //When
        String result = simpleUser.getUsername();                // [9]

        String expectedResult = "theForumUser";                  // [10]

        //Then
        Assertions.assertEquals(expectedResult, result);         // [11]
    }
}
