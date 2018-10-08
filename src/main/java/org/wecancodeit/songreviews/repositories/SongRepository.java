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
		add(new Song(1L, "Backseat Freestyle", "Kendrick Lamar", "good kid, M.A.A.d. city", "goodkid.jpg", "Hip Hop",
				"October 22, 2012", "GREATREVIEW"));
		add(new Song(2L, "Close Your Eyes (And Count to Fuck)", "Run the Jewels", "Run the Jewels 2", "rtj.jpg",
				"Hip Hop", "October 13, 2014", "GREATREVIEW"));
		add(new Song(3L, "Tuf Tiddy", "Shredders", "Dangerous Jumps", "shredders.jpg", "Hip Hop", "November 03, 2017",
				"GREATREVIEW"));
		add(new Song(4L, "Big Beast (ft. Bun B, T.I., and Trouble)", "Killer Mike", "R.A.P. Music", "killermike.jpg",
				"Hip Hop", "March 16, 2012", "GREATREVIEW"));
		add(new Song(5L, "A Milli", "Lil Wayne", "Tha Carter III", "amili.jpg", "Hip Hop", "March 11, 2008",
				"GREATREVIEW"));
		add(new Song(6L, "Back in Black", "AC/DC", "Back in Black", "acdc.jpg", "Rock", "December 21, 1980",
				"GREATREVIEW"));
		add(new Song(7L, "Immigrant Song", "Led Zeppelin", "Led Zeppelin III", "ledzep.jpg", "Rock", "November 5, 1970",
				"GREATREVIEW"));
		add(new Song(8L, "Who Are you", "The Who", "Who Are You", "who.jpg", "Rock", "July 14, 1978", "GREATREVIEW"));
		add(new Song(9L, "(I Can't Get No) Satisfaction", "The Rolling Stones", "Out of Our Heads", "stones.jpg",
				"Rock", "May 12, 1965", "GREATREVIEW"));
		add(new Song(10L, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "queen.jpg", "Rock", "August 31, 1975",
				"GREATREVIEW"));
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