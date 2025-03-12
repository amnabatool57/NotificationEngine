package com.work.inquiryengine.common;

public class BaseResponse<T> {

	private int code;
	private String message;
	private T body;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getBody() {
		return body;
	}

	public void setBody(T body) {
		this.body = body;
	}

	public BaseResponse(int i, String message, T body) {
		this.code = i;
		this.message = message;
		this.body = body;
	}

	@Override
	public String toString() {
		return "BaseResponse [code=" + code + ", message=" + message + ", body=" + body + "]";
	}

}
