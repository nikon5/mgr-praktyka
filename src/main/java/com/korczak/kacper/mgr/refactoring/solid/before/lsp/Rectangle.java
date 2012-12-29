package com.korczak.kacper.mgr.refactoring.solid.before.lsp;



public class Rectangle implements Quadrilateral{

	private int  height;
	private int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

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
