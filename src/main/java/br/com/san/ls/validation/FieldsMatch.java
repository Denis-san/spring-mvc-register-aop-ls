package br.com.san.ls.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = FieldsMatchValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldsMatch {
	
	String message() default "Os valores dos campos não correspondem!";
	
	String field();
	
	String fieldVerify();
	
	@Target({ElementType.TYPE})
	@Retention(RetentionPolicy.RUNTIME)
	@interface Fields{
		FieldsMatch[] value();
	}
	
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
