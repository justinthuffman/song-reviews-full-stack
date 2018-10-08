package org.wecancodeit.songreviews.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.songreviews.model.Song;

@Repository
public class SongRepository {
	private Map<Long, Song> songs = new HashMap<>();

	public SongRepository() {
		add(new Song(1L, "A Milli", "Lil Wayne", "Tha Carter III", "amili.jpg", "Hip Hop Bangers", "March 11, 2008",
				"GREATREVIEW"));
		add(new Song(2L, "Backseat Freestyle", "Kendrick Lamar", "good kid, M.A.A.d. city", "goodkid.jpg",
				"Hip Hop Bangers", "October 22, 2012", "GREATREVIEW"));
	}

	public int size() {
		return songs.size();
	}

	public void add(Song song) {
		songs.put(song.getId(), song);
	}

	public Song findOne(Long id) {
		return songs.get(id);
	}

	public Collection<Song> findAll() {
		return songs.values();
	}

}