package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void bigmacBuilderTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame seed bun")
                .burgers(2)
                .sauce("standard")
                .ingredient("onion")
                .ingredient("mushrooms")
                .ingredient("cheese")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(4, howManyIngredients);
    }
}