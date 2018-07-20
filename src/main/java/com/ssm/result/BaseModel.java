package com.ssm.result;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

@SuppressWarnings("serial")
public class BaseModel implements Serializable{

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
