package ictgradschool.industry.designpatterns.ex02;

import ictgradschool.industry.designpatterns.ex01.NestingShape;
import ictgradschool.industry.designpatterns.ex01.Shape;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class TreeModelAdapter implements TreeModel {
    private Shape _adaptee;

    //construct adapter by passing in the root nesting shape
    public TreeModelAdapter(Shape root){
        _adaptee = root;
    }

    @Override
    public Object getRoot() {
        return _adaptee;
    }

    @Override
    public Object getChild(Object parent, int index) {
        Shape result = null;

        if (parent instanceof NestingShape){
            NestingShape nestingShape =(NestingShape)parent;
            result=nestingShape.shapeAt(index);
        }

        return result;
    }

    @Override
    public int getChildCount(Object parent) {
        int result = 0;

        if (parent instanceof NestingShape){
            NestingShape nestingShape =(NestingShape)parent;
            result=nestingShape.shapeCount();
        }

        return result;
    }

    @Override
    public boolean isLeaf(Object node) {
        if (!(node instanceof NestingShape)){
            return true;
        }
        return false;
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {

    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        int resultIndex = -1;

        if (parent instanceof NestingShape){
            NestingShape parentShape =(NestingShape)parent;
            Shape childShape = (Shape)child;
            if(parentShape.contains(childShape)){
                resultIndex = parentShape.indexOf(childShape);
            }
        }
        return resultIndex;
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {

    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {

    }
}
