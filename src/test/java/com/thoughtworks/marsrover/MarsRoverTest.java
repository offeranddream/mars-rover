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

    @Test
    public void return_1_0_E_give_0_0_East() {
        MarsRover marsRover = new MarsRover();
        Coordinate nextCoordinate = new Coordinate(1, 0);

        marsRover.coordinate = new Coordinate(0, 0);
        marsRover.direction = Direction.E;
        marsRover.forward();

        // Then
        assertEquals(Direction.E, marsRover.direction);
        assertEquals(true, nextCoordinate.equals(marsRover.coordinate));
    }
}
