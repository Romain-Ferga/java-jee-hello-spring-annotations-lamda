package com.spring.annotations.tp.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotations.tp.beans.Hello;
import com.spring.annotations.tp.beans.HelloImpl;

public class HelloMainLambda {

	public static void main(String args[]) {

		try {

			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

			// Déclaration des beans
			ctx.registerBean(Hello.class, () -> new HelloImpl());

			ctx.refresh();

			// Utilisation des beans
			Hello beanHello = ctx.getBean(Hello.class);

			System.out.println(beanHello.sayHello("m2i students"));

			ctx.close();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
