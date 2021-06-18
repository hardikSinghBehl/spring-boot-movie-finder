package com.hardik.meeseeks.utility;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.hardik.meeseeks.configuration.OmdbConfigurationProperties;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
@EnableConfigurationProperties(value = OmdbConfigurationProperties.class)
public class UrlGenerator {

	private final OmdbConfigurationProperties omdbConfigurationProperties;

	public String generate(final String movieTitle) {
		final var properties = omdbConfigurationProperties.getOmdb();
		return properties.getUrl().replace("{key}", properties.getApiKey()).replace("{title}", movieTitle).trim()
				.replace(" ", "_");
	}

}
