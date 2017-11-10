package com.kanap.learning.domain;

import java.io.Serializable;

public class OutputObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1184282038828685289L;
	
	private Integer outputParam1;
	private Integer outputParam2;
	private Integer resutl;
	
	
	
	public OutputObject() {
		super();
	}
	public Integer getOutputParam1() {
		return outputParam1;
	}
	public void setOutputParam1(Integer outputParam1) {
		this.outputParam1 = outputParam1;
	}
	public Integer getOutputParam2() {
		return outputParam2;
	}
	public void setOutputParam2(Integer outputParam2) {
		this.outputParam2 = outputParam2;
	}
	public Integer getResutl() {
		return resutl;
	}
	public void setResutl(Integer resutl) {
		this.resutl = resutl;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((outputParam1 == null) ? 0 : outputParam1.hashCode());
		result = prime * result + ((outputParam2 == null) ? 0 : outputParam2.hashCode());
		result = prime * result + ((resutl == null) ? 0 : resutl.hashCode());
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
		OutputObject other = (OutputObject) obj;
		if (outputParam1 == null) {
			if (other.outputParam1 != null)
				return false;
		} else if (!outputParam1.equals(other.outputParam1))
			return false;
		if (outputParam2 == null) {
			if (other.outputParam2 != null)
				return false;
		} else if (!outputParam2.equals(other.outputParam2))
			return false;
		if (resutl == null) {
			if (other.resutl != null)
				return false;
		} else if (!resutl.equals(other.resutl))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OutputObject [outputParam1=" + outputParam1 + ", outputParam2=" + outputParam2 + ", resutl=" + resutl
				+ "]";
	}
	
	
	

}
