package com.apstamp45.JON;

import java.util.ArrayList;

/**
 * This class is the base of any
 * JON item.
 */
public class Node {

	/**
	 * This String is used to access
	 * the Node when using getChild().
	 */
	protected String name;

	/**
	 * This Node has the value of the
	 * parent Node, and is updated
	 * whenever addChild() or 
	 * addChildren() is called. 
	 */
	protected Node parent;

	/**
	 * This ArrayList<Node> stores the
	 * Node's children.
	 */
	private ArrayList<Node> children;

	/**
	 * This constructor creates a Node.
	 * When adding children, you don't
	 * need to give the parent, as it
	 * will be set automatically.
	 * @name The Node's name.
	 * @parent The Node's parent.
	 * @children The children you can add to 
	 * the Node.
	 */
	public Node(String name, Node... children) {
		this.children = new ArrayList<Node>();
		this.name = name;
		if (children.length > 0) {
			addChildren(children);
		} 
	}

	/**
	 * Adds given Nodes to this.children.
	 * @children The children to add.
	 */
	public void addChildren(Node... children) {
		for (Node child: children) {
			if (this.children.size() > 0) {
				for (Node presentChild: this.children) {
					if (presentChild.getName().equals(child.getName())) {
						throw new IllegalArgumentException("The Node \"" + child.getName() + "\" already exists in \"" + this.getName() + "\".");
					} else {
						child.parent = this;
						this.children.add(child);
					}
				}
			} else {
				child.parent = this;
				this.children.add(child);
			}
		}
	}

	/**
	 * get a specific Node from
	 * this.children using the Node's
	 * name.
	 * @name The name of the child you 
	 * want to get.
	 * @return The child with the given name.
	 */
	public Node getChild(String name) {
		for (Node child: children) {
			if (child.getName().equals(name)) {
				return child;
			} 
		} 
		throw new IllegalArgumentException("Node \"" + this.name
			       	+ "\" does not contain a child with the name \""
			       	+ name + "\".");
	}

	/**
	 * Returns all of the Node's children in
	 * the form of an ArrayList<Node>.
	 * @return An ArrayList<Node> containing
	 * all of this Node's children.
	 */
	public ArrayList<Node> getChildren() {
		return children;
	}
	
	/**
	 * Returns this Node's name.
	 * @return This Node's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the value of the parent
	 * Node.
	 * @return The parent Node's value.
	 */
	public Node parent() {
		return parent;
	}

	/**
	 * Updates all of the children's
	 * parent variables to the new value 
	 * of this.
	 */
	private void updateChildren() {
		for (Node child: children) {
			child.parent = this;
		}
	}
}
