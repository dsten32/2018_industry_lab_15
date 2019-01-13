package ictgradschool.industry.designpatterns.ex01;

import java.awt.*;
import java.util.List;

public class NestingShape extends Shape{
    // === Constants for default values. ===
    protected static final int DEFAULT_X_POS = 0;

    protected static final int DEFAULT_Y_POS = 0;

    protected static final int DEFAULT_DELTA_X = 5;

    protected static final int DEFAULT_DELTA_Y = 5;

    protected static final int DEFAULT_HEIGHT = 35;

    protected static final int DEFAULT_WIDTH = 25;
    // ===
    //instance variables
    private int x,y,deltaX,deltaY,width,height;
    private List<Shape> childShapes;

    public NestingShape() {
        this.x = DEFAULT_X_POS;
        this.y = DEFAULT_Y_POS;
        this.deltaX=DEFAULT_DELTA_X;
        this.deltaY=DEFAULT_DELTA_Y;
        this.width=DEFAULT_WIDTH;
        this.height=DEFAULT_HEIGHT;
    }

    public NestingShape(int x, int y) {
        this.x = x;
        this.y = y;
        this.deltaX=DEFAULT_DELTA_X;
        this.deltaY=DEFAULT_DELTA_Y;
        this.width=DEFAULT_WIDTH;
        this.height=DEFAULT_HEIGHT;
    }

    public NestingShape(int x, int y, int deltaX, int deltaY) {
        this.x = x;
        this.y = y;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.width=DEFAULT_WIDTH;
        this.height=DEFAULT_HEIGHT;
    }

    public NestingShape(int x, int y, int deltaX, int deltaY, int width, int height) {
        this.x = x;
        this.y = y;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.width = width;
        this.height = height;
    }

    public void move(int width,int height){
        //moves the shape, not sure about child shapes yet
        //Todo add child stuff
        int nextX = x + deltaX;
        int nextY = y + deltaY;

        if (nextX <= 0) {
            nextX = 0;
            deltaX = -deltaX;
        } else if (nextX + this.width >= width) {
            nextX = width - this.width;
            deltaX = -deltaX;
        }

        if (nextY <= 0) {
            nextY = 0;
            deltaY = -deltaY;
        } else if (nextY + this.height >= height) {
            nextY = height - this.height;
            deltaY = -deltaY;
        }

        x = nextX;
        y = nextY;
    }

    public void add(Shape child) throws IllegalArgumentException{
        //checks size of shape and throws exception if too big for the containing shape.
        if(child.getWidth()>this.width || child.getHeight()>this.height){
            throw new  IllegalArgumentException("Shape too big");
        }

        //todone need to add check if shape is already a child.
        for (Shape shape:childShapes
             ) {
            if(child==shape){
                throw new IllegalArgumentException("Shape is already a child");
            }
        }

        //todone then add shape to containing shape.
        childShapes.add(child);
    }

    public void remove(Shape child){
        //todo

    }

    public Shape shapeAt(int index){
        //todo
        Shape shape;

        return shape;
    }

    public int shapeCount(){
        //todo
        int count =0;

        return count;
    }

    public int indexOf(Shape child){
        //todo
        int index;
        return index;
    }

    public boolean contains(Shape child){
        //todo
        boolean contains;
        return contains;
    }

    public void paint(Painter painter){
        //todone (i think) deal with children
        painter.setColor(Color.MAGENTA);//make the NestedShape magenta so it's obvious
        painter.drawRect(x,y,width,height);
        for (Shape shape:childShapes
             ) {
            shape.paint(painter);
        }
    }

}
