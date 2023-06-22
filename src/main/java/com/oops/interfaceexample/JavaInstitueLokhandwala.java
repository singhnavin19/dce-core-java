package com.oops.interfaceexample;

public class JavaInstitueLokhandwala implements JavaInstitue{

	@Override
	public String getTopics() {
		String s;
		return "Advance Java";
	}

	@Override
	public int getFee(String topic) {
		if(topic.equalsIgnoreCase("Advance Java")) {
			return 12000;
		}
		if(topic.equalsIgnoreCase("java")) {
			return 10000;
		}
		return 0;
	}

	
}
