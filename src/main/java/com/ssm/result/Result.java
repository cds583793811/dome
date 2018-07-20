package com.ssm.result;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

public class Result<T extends Serializable> {
	T data;
	String code;
	String msg = "";

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean hasError(){
		return !"2000".equals(this.getCode());
	}
	public static <T extends Serializable> Result<T> redirect(T data) {
		Result<T> result = new Result<T>();
		result.setData(data);
		result.setCode("3002");

		return result;
	}
	public static <T extends Serializable> Result<T> redirect(T data,String msg) {
		Result<T> result = new Result<T>();
		result.setData(data);
		result.setCode("3002");
		result.setMsg(msg);

		return result;
	}
	public static <T extends Serializable> Result<T> success(T data) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("2000");

		return success;
	}
	
	@SuppressWarnings("unchecked")
	public static <T extends Serializable> Result<T> successMap(String key,Object value) {
		Result<T> success = new Result<T>();
		Map<String,Object> data=new LinkedHashMap<String,Object>();
		data.put(key, value);
		success.setData((T) data);
		success.setCode("2000");

		return success;
	}
	@SuppressWarnings("unchecked")
	public static <T extends Serializable> Result<T> successIdModel(Long id) {
		Result<T> success = new Result<T>();
		IdModel idModel=new IdModel(id);
		success.setData((T) idModel);
		success.setCode("2000");

		return success;
	}

	public static <T extends Serializable> Result<T> success(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("2000");
		success.setMsg(msg);
		return success;
	}

	public static <T extends Serializable> Result<T> failure(T data) {
		return failure(data, "failure!");
	}

	public static <T extends Serializable> Result<T> failure(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4000");
		success.setMsg(msg);
		return success;
	}

	public static <T extends Serializable> Result<T> unkwon(T data) {
		return unkwon(data, "unkown error!");
	}

	public static <T extends Serializable> Result<T> unkwon(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("5000");
		success.setMsg(msg);
		return success;
	}

	public static <T extends Serializable> Result<T> notfound(T data) {
		return notfound(data, "not found!");
	}

	public static <T extends Serializable> Result<T> notfound(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4004");
		success.setMsg(msg);
		return success;
	}

	public static <T extends Serializable> Result<T> notLogin(T data) {
		return notLogin(data, "not Login!");
	}

	public static <T extends Serializable> Result<T> notLogin(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4001");
		success.setMsg(msg);
		return success;
	}
	public static <T extends Serializable> Result<T> notBindMobile(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4002");
		success.setMsg(msg);
		return success;
	}

	public static <T extends Serializable> Result<T> tokenInvalid(T data) {
		return tokenInvalid(data, "token invalid!");
	}

	public static <T extends Serializable> Result<T> tokenInvalid(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4003");
		success.setMsg(msg);
		return success;
	} 
	public static <T extends Serializable> Result<T> noRight(T data) {
		return noRight(data, "not right!");
	}

	public static <T extends Serializable> Result<T> noRight(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4003");
		success.setMsg(msg);
		return success;
	}

	public static <T extends Serializable> Result<T> tokenExpired(T data) {
		return tokenExpired(data, "token expired!");
	}

	public static <T extends Serializable> Result<T> tokenExpired(T data, String msg) {
		Result<T> success = new Result<T>();
		success.setData(data);
		success.setCode("4003");
		success.setMsg(msg);
		return success;
	} 
}
