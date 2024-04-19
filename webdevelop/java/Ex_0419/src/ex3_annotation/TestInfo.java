package ex3_annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.TYPE_USE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	String value() default "정보1";
	String[] testTool() default "info1";
	String tester();
	DateTime datetime();
}
