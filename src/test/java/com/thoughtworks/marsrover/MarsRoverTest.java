package com.thoughtworks.marsrover;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void return_0_0_give_0_0() {
        // given
        MarsRover marsRover = new MarsRover();

        // When
        marsRover.coordinate = new Coordinate(0, 0);

        // Then
        assertEquals(0, marsRover.coordinate.x);
        assertEquals(0, marsRover.coordinate.y);
    }

    @Test
    public void return_East_give_East() {
        // given
        MarsRover marsRover = new MarsRover();

        // When
        marsRover.direction = Direction.E;

        // Then
        assertEquals(Direction.E, marsRover.direction);
    }
}
