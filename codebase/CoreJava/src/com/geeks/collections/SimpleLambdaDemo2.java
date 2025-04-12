package com.geeks.collections;

public class SimpleLambdaDemo2 {
public static void main(String[] args) {
	//Create a Lambda for Maths interface
	//call doEval fn
}

static void doEval(Maths m, float a,float b) {
	System.out.println(m.eval(a, b));
}
}
interface Maths{
	float eval(float a,float b);
}