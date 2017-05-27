package com.ele.common.utils.entity;


import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * 结果返回对象
 * @author yaoxj
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultMessage {
	/**
	 * 是否成功
	 */
	private Boolean success;
	/**
	 * 额外对象
	 */
	private Object object;

	public ResultMessage() {
	}

	public ResultMessage(Boolean success, Object object) {
		this.success = success;
		this.object = object;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Object getObject() {
		return this.object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}