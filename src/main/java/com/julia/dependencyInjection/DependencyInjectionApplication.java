package com.julia.dependencyInjection;

import com.julia.dependencyInjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		/*we can ask the context for an instance of the controller
		we need to do a cast because it returns an Object type
		conventionally, the bean name is the same as the class only starting with lowercase
		 when it starts, Spring is going to scan for beans and create them into the context
		 We never actually create a new context with new MyContext(), So Spring creates the instance and puts it into the context
		*/
		System.out.println("--------------------- (Spring) constructor injected controller using @Primary annotated service");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("--------------------- (Spring) property injected controller");
		SpringPropertyInjectedController springPropertyInjectedController = (SpringPropertyInjectedController) ctx.getBean("springPropertyInjectedController");
		System.out.println(springPropertyInjectedController.getGreeting());

		System.out.println("--------------------- (Spring) setter injected controller");
		SpringSetterInjectedController springSetterInjectedController = (SpringSetterInjectedController) ctx.getBean("springSetterInjectedController");
		System.out.println(springSetterInjectedController.getGreeting());

		System.out.println("--------------------- (Spring) constructor injected controller");
		SpringConstructorInjectedController springConstructorInjectedController = (SpringConstructorInjectedController) ctx.getBean("springConstructorInjectedController");
		System.out.println(springConstructorInjectedController.getGreeting());

		System.out.println("--------------------- (Spring) I18n controller");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
	}

}
