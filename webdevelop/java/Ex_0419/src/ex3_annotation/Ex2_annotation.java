package ex3_annotation;

import java.lang.annotation.Annotation;

//@TestInfo
public class Ex2_annotation {

	public static void main(String[] args) {
		Annotation[] annos = Ex2_annotation.class.getAnnotations();
		for(Annotation anno : annos) {
			System.out.println(anno);
		}
		
		TestInfo testIntfo = Ex2_annotation.class.getAnnotation(TestInfo.class);
		System.out.println(testIntfo.value());

	}

}
