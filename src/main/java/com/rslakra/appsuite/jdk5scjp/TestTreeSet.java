package com.rslakra.appsuite.jdk5scjp;

import java.util.TreeSet;

class Name implements Comparable<Name> {
	private String name;
	
	Name(String name) {
		this.name = name;
	}
	
	/**
	 * @param o
	 * @return
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Name other) {
		if (this != other && other != null) {
			return name.compareTo(other.name);
		}
		
		return 0;
	}
	
	/**
	 * Returns the string representation of this object.
	 * 
	 * @return
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return name;
	}
}

public class TestTreeSet {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Name> treeSet = new TreeSet<>();
		treeSet.add(new Name("Rohtash"));
		treeSet.add(new Name("Rohtash"));
		treeSet.add(new Name("Lakra"));
		System.out.println(treeSet);
	}
	
}
