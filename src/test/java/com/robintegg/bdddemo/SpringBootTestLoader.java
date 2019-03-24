package com.robintegg.bdddemo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.java.Before;

@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
@ContextConfiguration(initializers = SpringBootTestLoader.Initializer.class)
public class SpringBootTestLoader {

	@Before
	public void loadSpring() {
		// do nothing
	}

	static class Initializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

		@Override
		public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

			TestPropertyValues.of("server.port=8080", "spring.datasource.url=jdbc:postgresql://localhost:"
					+ Containers.POSTGRES.getMappedPort(5432) + "/postgres"

			).applyTo(configurableApplicationContext.getEnvironment());

		}

	}

}
