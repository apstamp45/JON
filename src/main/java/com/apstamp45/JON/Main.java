/*
 * This project attempts to create a
 * JavaScript-like object layout in
 * the Java language. It is simply
 * a fun practice project.
 */

package com.apstamp45.JON;

/**
 * Main class.
 * @author apstamp45
 */
public class Main {
	public static void main(String[] args) {
		Node dog = new Node("dog");
		dog.addChildren(new Value<String>("name", "Doug"));
		Value<String> name = (Value<String>) dog.getChild("name");
		System.out.print(name.getValue());
	}
}
