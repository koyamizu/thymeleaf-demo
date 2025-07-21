package com.example.demo.entity;

public class PhysicalExamination {
	
	private double height;
	private double weight;
	
	public PhysicalExamination(double height,double weight) {
		this.height=height;
		this.weight=weight;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getBmi() {
		return weight/(height*height);
	}
	
	public String getRank() {
		double bmi=getBmi();
		if(bmi<18.5) {
			return "やせ気味";
		}
		if(bmi<25) {
			return "標準";
		}
		return "肥満気味";
	}
}