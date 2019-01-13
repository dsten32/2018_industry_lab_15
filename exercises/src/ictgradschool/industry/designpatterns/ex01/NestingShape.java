package ictgradschool.industry.designpatterns.ex01;

public class NestingShape {
    private int x,y,deltaX,deltaY,width,height;

    public NestingShape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public NestingShape(int x, int y, int deltaX, int deltaY) {
        this.x = x;
        this.y = y;
        this.deltaX = deltaX;
        this.deltaY = deltaY;
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
