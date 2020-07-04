package de.dennisboldt;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {
	private String value;

	public Data() {
	}

	public Data(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
