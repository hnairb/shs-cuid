package com.searshc.hs.sywr.hs.searshc.com.request;

import com.searshc.hs.sywr.Type;

public class LookupRequest {

	protected String value;
	protected Type type;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
