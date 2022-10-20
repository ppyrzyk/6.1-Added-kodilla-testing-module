package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> shapeCollection = new ArrayList<>();

    public void addShape(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeShape(Shape shape) {
        if (shapeCollection.contains(shape)) {
            shapeCollection.remove(shape);
            return true;
        }
        return false;
    }

    public Shape getShape(int n) {
        return shapeCollection.get(n);
    }

    public String getShowShapes() {
            for (Shape collectionList : shapeCollection) {
                System.out.println(collectionList.getShapeName());
            }
            return null;
        }

        public int getSize () {
            return shapeCollection.size();
        }
    }
