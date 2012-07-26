package com.korczak.kacper.mgr.refactoring.solid.before.lsp;

public class Square extends Rectangle{

	private int sideLength;

	private Square(int height, int width) {
		super(height, width);
		sideLength = height;
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
