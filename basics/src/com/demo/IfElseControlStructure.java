package com.demo;

public class IfElseControlStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isMoving=true;
		int currentSpeed=10;
		if(isMoving) {
			currentSpeed--;
			System.out.println("The bicycle speed got reduced!");
		}
		else {
			System.out.println("The bicylce has already already stopped");
		}

	}

}

