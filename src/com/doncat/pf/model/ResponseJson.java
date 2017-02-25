package com.doncat.pf.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.doncat.pf.enums.JsonStatusEnum;

/**
 * 返回的Json对象
 * @author Lobinary
 *
 */
public class ResponseJson {
	
	private JsonStatusEnum status;
	private String msg;
	private Object data;
	
	public ResponseJson() {
		super();
		this.status = JsonStatusEnum.SUCCESS;
		this.msg = "";
	}

	
	public ResponseJson(Object data) {
		super();
		this.status = JsonStatusEnum.SUCCESS;
		this.msg = "";
		this.data = data;
	}
	
	public ResponseJson(JsonStatusEnum status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public JsonStatusEnum getStatus() {
		return status;
	}
	public void setStatus(JsonStatusEnum status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "ResponseJson [status=" + status + ", msg=" + msg + ", data=" + data + "]";
	}

	@SuppressWarnings("unchecked")
	public ResponseJson add(Object key, Object value) {
		if(data==null){
			this.data=new HashMap<Object,Object>();
		}
		((HashMap<Object, Object>) data).put(key,value);
		return this;
	}

	@SuppressWarnings("unchecked")
	public ResponseJson add( Object value) {
		if(data==null){
			this.data=new ArrayList<Object>();
		}
		((List< Object>) data).add(value);
		return this;
	}
}
