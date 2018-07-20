package com.ssm.result;

public class IdModel extends BaseModel{

	private Long id;
	
	public IdModel() {
		
	}
	
	public IdModel (Long id) {
		super();
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
}
