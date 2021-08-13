package com.apstamp45.JON;

/**
 * This Node does not have any
 * children, only one Object value.
 */
public class Value<T> extends Node {

	/**
	 * This variable stores the value
	 * of this Value Node.
	 */
	private T value;

	/**
	 * Creates a Value with no set value.
	 * @name The Value's name.
	 */
	public Value(String name) {
		super(name);
	}

	/**
	 * Creates a Value and sets it's value.
	 * @name The Value's name.
	 * @value the Value's value.
	 */
	public Value(String name, T value) {
		super(name);
		this.value = value;
	}
	
	/**
	 * Gets the value of this Value.
	 * @return This Value's value.
	 */
	public T getValue() {
		return value;
	}

	/**
	 * Sets the value of this Value.
	 * @value The new value.
	 */
	public void setValue(T value) {
		this.value = value;
	}
}
