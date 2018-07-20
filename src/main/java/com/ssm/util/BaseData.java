package com.ssm.util;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class BaseData implements Serializable{

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
