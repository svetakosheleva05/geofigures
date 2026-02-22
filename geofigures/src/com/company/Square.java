
package com.company;

public class Square extends Figure{
    private int side;
    
    public Square(int side) {
        this.side = side;
    }
    
    @Override
    public int findPerimetr() {
        return side * 4;
    }
    
    @Override
    public int findArea() {
        return side * side;
    }
}
