package org.wecancodeit.songreviews.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(SongController.class)
public class SongControllerTest {

	/*
	 * @Autowired - a Spring annotation that will find you a version of whatever you
	 * specify and inject that dependency.
	 * 
	 */
	@Autowired
	private MockMvc mockMvc;

	/*
	 * Remember we are mocking Springs MVC structure.
	 * 
	 * Which is to say we are using a fake version of Spring MVC so we can isolate
	 * our tests to just the @Controller we're creating
	 * 
	 */

	@Test
	public void shouldBeOkWhenAccessingSongs() throws Exception {
		// Arrange - Grab mockMvc
		mockMvc
				// Act - Perform the Mock request to localhost:8080/songs
				.perform(get("/songs"))
				// Assert - Assert that we got back a 2xx HTTP status
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnSongsTemplateWhenAccessingSongs() throws Exception {
		// Arrange
		mockMvc
				// Act
				.perform(get("/songs"))
				// Assert
				.andExpect(view().name("songs"));
	}

	@Test
	public void shouldBeOkWhenAccessingSong() throws Exception {
		// Arrange - Grab mockMvc
		mockMvc
				// Act - Perform the Mock request to localhost:8080/songs
				.perform(get("/songs/1"))
				// Assert - Assert that we got back a 2xx HTTP status
				.andExpect(status().isOk());
	}

	@Test
	public void shouldReturnSongTemplateWhenAccessingSong() throws Exception {
		// Arrange
		mockMvc
				// Act
				.perform(get("/songs/1"))
				// Assert
				.andExpect(view().name("song"));
	}
}