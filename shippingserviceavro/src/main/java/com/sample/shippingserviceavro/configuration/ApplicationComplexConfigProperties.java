package com.sample.shippingserviceavro.configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "valid")
public class ApplicationComplexConfigProperties {

	Map<String, List<String>> logistics = new HashMap<>();

	public Map<String, List<String>> getLogistics() {
		return logistics;
	}

	public void setLogistics(Map<String, List<String>> logistics) {
		this.logistics = logistics;
	}

}
