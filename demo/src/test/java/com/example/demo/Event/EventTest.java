package com.example.demo.Event;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class EventTest {

	@Test
	public void builder() {
		Event event = Event.builder()
				.name("prorsumhj")
				.description("REST API dev")
				.build();
		assertThat(event).isNotNull();
	 
	}

	@Test
	public void javaBean() {
		// Given
		String name = "Event";
		String description = "SpringBoot";
		
		// When 
		Event event = new Event();
		event.setName(name);
		event.setDescription(description);

		// Then 
		assertThat(event.getName()).isEqualTo(name);
		assertThat(event.getDescription()).isEqualTo(description);
	}
	
}
