package com.example.snake;

public class HeadingRight implements HeadingDirection {
    @Override
    public Snake.Heading headingDirection(Snake.Heading hd) {
        switch (hd) {
            case UP:
                return Snake.Heading.RIGHT;
            case RIGHT:
                return Snake.Heading.DOWN;
            case DOWN:
                return Snake.Heading.LEFT;
            case LEFT:
                return Snake.Heading.UP;
            default:
                throw new IllegalArgumentException("ERROR:HEADING ISSUE: " + hd);
        }
    }
}