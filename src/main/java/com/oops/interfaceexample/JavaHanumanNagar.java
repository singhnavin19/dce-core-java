package com.oops.interfaceexample;

public class JavaHanumanNagar implements JavaInstitue{

	@Override
	public String getTopics() {
		return "java";
	}

	@Override
	public int getFee(String topic) {
		if(topic.equalsIgnoreCase("java")) {
			return 8000;
		}else if(topic=="Advance Java") {
			return 10000;
		}
		return 0;
	}

}
