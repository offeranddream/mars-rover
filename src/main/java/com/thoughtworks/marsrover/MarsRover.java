package com.thoughtworks.marsrover;

/**

 Y       N
         |
         |
 X  W---------E
         |
 *       |
 *       S
 */
public class MarsRover {
    public Coordinate coordinate;
    public Direction direction;
    private int speed = 1;

    public Coordinate forward() {
        switch (direction) {
            case E:
                coordinate.x += speed; break;
            case W:
                coordinate.x -= speed; break;
            case S:
                coordinate.y -= speed; break;
            case N:
                coordinate.y += speed; break;
        }
        return coordinate;
    }
}
