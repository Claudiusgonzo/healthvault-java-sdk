package com.microsoft.healthvault.types;

public class StringZ1024 extends ConstrainedString {

	public StringZ1024() {
		this(null);
	}

	public StringZ1024(String value) {
		minLength = 0;
		maxLength = 1024;
		setValue(value);
	}
}
