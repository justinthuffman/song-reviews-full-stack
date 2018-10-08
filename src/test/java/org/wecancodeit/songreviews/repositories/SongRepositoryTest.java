package org.wecancodeit.songreviews.repositories;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.songreviews.model.Song;

public class SongRepositoryTest {
	private SongRepository songRepo = new SongRepository();

	@Test
	public void shouldAcceptSongs() {
		// Arrange
		Song song = new Song(1L, "Song1", "artist1,", "album1", "Album image1", "review category1", "release date1",
				"content1", "uri1");
		// Act
		int repoSizeBeforeAdding = songRepo.size();
		songRepo.add(song);
		int repoSizeAfterAdding = songRepo.size();
		// Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
	}

	@Test
	public void findOneShouldReturnOneSong() {
		Song song = new Song(2L, "Song2", "artist2,", "album2", "Album image2", "review category2", "release date2",
				"content2", "uri2");

		songRepo.add(song);
		Song result = songRepo.findOne(2L);

		assertThat(result.getName(), is("Song1"));
	}

	@Test
	public void findAllShouldReturnAllSongs() {
		Song song3 = new Song(3L, "Song3", "artist3,", "album3", "Album image3", "review category3", "release date3",
				"content3", "uri3");
		Song song4 = new Song(4L, "Song4", "artist4,", "album4", "Album image4", "review category4", "release date4",
				"content4", "uri4");

		songRepo.add(song3);
		songRepo.add(song4);

		Collection<Song> result = songRepo.findAll();

		assertThat(result, hasItems(song3, song4));
	}

}