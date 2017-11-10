package com.kanap.learning.domain;

import java.io.Serializable;

public class InputObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5045865905228100482L;
	private Integer input1;
	private Integer input2;
	
	
	public InputObject() {
		super();
	}
	public Integer getInput1() {
		return input1;
	}
	public void setInput1(Integer input1) {
		this.input1 = input1;
	}
	public Integer getInput2() {
		return input2;
	}
	public void setInput2(Integer input2) {
		this.input2 = input2;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((input1 == null) ? 0 : input1.hashCode());
		result = prime * result + ((input2 == null) ? 0 : input2.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InputObject other = (InputObject) obj;
		if (input1 == null) {
			if (other.input1 != null)
				return false;
		} else if (!input1.equals(other.input1))
			return false;
		if (input2 == null) {
			if (other.input2 != null)
				return false;
		} else if (!input2.equals(other.input2))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InputObject [input1=" + input1 + ", input2=" + input2 + "]";
	}
	
	
	
	
}
