package com.korczak.kacper.mgr.refactoring.solid.after.lsp;

public class Rectangle implements Quadrilateral{

	private int height;
	private int width;

	@Override
	public int getArea() {
		return height * width;
	}

	@Override
	public int getPerimeter() {
		int heightSidesCount = 2;
		int widthSidesCount = 2;
		return (heightSidesCount * height) + (widthSidesCount * width);
	}
}
