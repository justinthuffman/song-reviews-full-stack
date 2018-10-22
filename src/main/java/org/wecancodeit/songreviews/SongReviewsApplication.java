package org.wecancodeit.songreviews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SongReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongReviewsApplication.class, args);
		System.out.println("\n\n\n\nCurrently running on port 8080\n\n\n\n");
	}
}
