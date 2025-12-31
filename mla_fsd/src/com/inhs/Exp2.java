package com.inhs;

class C {
	public void show() {
		System.out.println("Top most parent");
	}
}

class D extends C {
	public void cat() {
		System.out.println("Intermediate Parent");
	}
}

class E extends D {
	public void fox() {
		System.out.println("Intermediate Parent");
	}
}

class F extends E {
	public void dog() {
		System.out.println("Bottom most class");
	}
}

public class Exp2 {

	public static void main(String[] args) {
	
		F obj = new F();
		
		obj.dog();
		obj.fox();
		obj.cat();
		obj.show();
	}

}
