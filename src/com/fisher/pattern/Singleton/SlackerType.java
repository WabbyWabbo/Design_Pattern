package com.fisher.pattern.Singleton;

public class SlackerType {
	// private static
	private static SlackerType instance = null;

	// private constructor
	private SlackerType() {

	}

	// public static interface
	public static SlackerType getInstance() {
		if (instance == null) {
			instance = new SlackerType();
		}
		return instance;
	}
}
