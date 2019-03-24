package com.robintegg.bdddemo;

import org.testcontainers.containers.GenericContainer;

public class Containers {

	public static final GenericContainer POSTGRES = new GenericContainer("postgres")
			.withEnv("POSTGRES_PASSWORD", "mysecretpassword").withExposedPorts(5432);

}
