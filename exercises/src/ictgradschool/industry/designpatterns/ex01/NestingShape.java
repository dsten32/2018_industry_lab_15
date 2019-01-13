package ictgradschool.industry.designpatterns.ex01;

public class NestingShape {
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

    }

    public void ad(Shape child){

    }

    public void remove(Shape child){

    }

    public Shape shapeAt(int index){
        Shape shape;

        return shape;
    }

    public int shapeCount(){
        int count =0;

        return count;
    }

    public int indexOf(Shape child){
        int index;
        return index;
    }

    public boolean contains(Shape child){
        boolean contains;
        return contains;
    }

    public void paint(Painter paint){

    }

}
