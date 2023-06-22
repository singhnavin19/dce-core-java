package com.oops.interfaceexample;


public class JavaInstitueFactory {
	
	 JavaInstitue javaInstitute;
	
	JavaInstitueFactory(JavaInstitue javaInstitute){
		this.javaInstitute=javaInstitute;
	}

	public static void main(String[] args) {
		//int i=10;
		JavaInstitue j1=new JavaInstitueLokhandwala();
		JavaInstitueFactory f1=new JavaInstitueFactory(j1);
		
		System.out.println(f1.javaInstitute.getTopics());
		
		f1=new JavaInstitueFactory(new JavaHanumanNagar());
		String hanumanNagarTopics=f1.javaInstitute.getTopics();
		System.out.println(hanumanNagarTopics);
		System.out.println(f1.javaInstitute.getFee(hanumanNagarTopics));
	}
}
