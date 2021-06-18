package com.hardik.meeseeks.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hardik.meeseeks.dto.MovieDto;
import com.hardik.meeseeks.utility.UrlGenerator;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MovieService {

	private final UrlGenerator urlGenerator;
	private final RestTemplate restTemplate;

	public ResponseEntity<MovieDto> find(final String movieTitle) {
		final var response = restTemplate.getForEntity(urlGenerator.generate(movieTitle), MovieDto.class);
		final var movieDto = response.getBody();

		if (movieDto.getResponse().equalsIgnoreCase("FALSE"))
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok(movieDto);
	}

}
