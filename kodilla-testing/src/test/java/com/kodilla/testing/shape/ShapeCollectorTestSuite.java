package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@Nested
@DisplayName("Shape collector test suite")
class ShapeCollectorTestSuite {

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

    List<Shape> shapes = new ArrayList<>();
    ShapeCollector shapeCollector = new ShapeCollector(shapes);
    @DisplayName("Adding shapes test")
    @Test
    void testAdd_GetFigures() {
        //given
        Shape disk = new Disk("disk", 34.5);
        Shape triangle = new Triangle("triangle", 26.8);
        Shape square = new Square("square", 14.9);
        //when
        shapeCollector.addFigure(disk);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //then
        assertEquals(disk, shapeCollector.getFigure(0));
        assertEquals(triangle, shapeCollector.getFigure(1));
        assertEquals(square, shapeCollector.getFigure(2));
    }
    @DisplayName("Removing shape test")
    @Test
    void testRemove_ShowFigures() {
        //given
        Shape disk = new Disk("disk", 34.5);
        Shape triangle = new Triangle("triangle", 26.8);
        Shape square = new Square("square", 14.9);
        shapeCollector.addFigure(disk);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(square);
        //when
        boolean remove = shapeCollector.removeFigure(disk);
        //then
        assertTrue(remove);
        assertNotEquals(disk, shapeCollector.getFigure(0));
        assertEquals("triangle square ", shapeCollector.showFigures());
    }
    @DisplayName("Removing non-existent shape test")
    @Test
    void testRemoveNonExistentFigure() {
        //given
        Shape disk = new Disk("disk", 34.5);
        Shape square = new Square("square", 14.9);
        shapeCollector.addFigure(square);
        //when
        boolean remove = shapeCollector.removeFigure(disk);
        //then
        assertFalse(remove);
    }
}
