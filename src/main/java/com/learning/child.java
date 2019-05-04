package com.learning;

class parent {
	parent print() {
		System.out.println("parent");
		return null;

	}
}

class child extends parent {
	child print() {
		System.out.println("child");
		return null;

	}

	public static void main(String[] args) {
		parent child = new parent();
		child.print();
	}
}
