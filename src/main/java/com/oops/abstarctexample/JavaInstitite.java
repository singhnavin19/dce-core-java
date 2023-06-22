package com.oops.abstarctexample;

abstract class JavaInstititeClass {
	public abstract String javaTopics();
}

class Dynamic extends JavaInstititeClass{

	@Override
	public String javaTopics() {
		return "core Java";
	}
}

class Smart extends JavaInstititeClass{

	@Override
	public String javaTopics() {
		return "java";
	}
}

public class JavaInstitite{
	JavaInstititeClass JavaInstititeClass;
	
	JavaInstitite(JavaInstititeClass JavaInstititeClass){
		this.JavaInstititeClass=JavaInstititeClass;
	}
	public static void main(String[] args) {
		System.out.println("hello");
	}
}