package com.korczak.kacper.mgr.refactoring.solid.after.lsp;

public class Square implements Quadrilateral{

	private int sideLength;

	public Square(int side) {
		this.sideLength = side;
	}

	@Override
	public int getArea() {
		return sideLength^2;
	}

	@Override
	public int getPerimeter() {
		int sidesCount = 4;
		return sidesCount * sideLength;
	}

}
