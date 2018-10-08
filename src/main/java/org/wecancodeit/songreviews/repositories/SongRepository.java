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
				"October 22, 2012",
				"Though Kendrick Lamar starts \"Backseat Freestyle\" by comparing himself to Martin Luther King, Jr., this new single from good kid, m.A.A.d. city is less voice-of-a-generation than it is a challenge to other rappers-- specifically, try and keep up. The song, which features jabbering production from Hit-Boy, is the kind of technical showcase that launched Kendrick to the top of everyone’s list last year. The way he structures this track is particularly clever; there’s a hook, but because the beat is consistent throughout, it's less of an energy amplifier than a place for the listener to catch their breath, since oxygen is something Kendrick never seems to need. When he reaches the third verse, he starts growling, larynx contracting in an aural reflection of the dominance on display. - Jonah Bromwich, Pitchfork.com",
				"3aGibUHhQyBsyumYHylw0K"));
		add(new Song(2L, "Close Your Eyes (And Count to Fuck)", "Run the Jewels", "Run the Jewels 2", "rtj.jpg",
				"Hip Hop", "October 13, 2014",
				"When was the last time you heard Zack de la Rocha on a song? You know, the dude from Rage Against the Machine. Was it with poet Saul Williams on \"Shakespeare\"? Or maybe with KRS-ONE and the Last Emperor on \"C.I.A.\"? Now, you can have an updated response if someone asks you that question—the former Rage rocker has teamed with Run the Jewels (aka rappers El-P and Killer Mike) on \"Close Your Eyes (And Count to Fuck)\", the latest single from El and Mike’s forthcoming RTJ2, out October 27.\n"
						+ "\n"
						+ "Rocha does double-duty on \"Close Your Eyes\", as his unmistakable voice is looped into El-P’s neck-breaking production. His verse isn’t too shabby either; he name-checks Rakim and nods to Miles Davis’ Bitches Brew. El and Mike say what you’d expect, with all the face-stomping grit that made Run the Jewels so necessary. Kill a warden, Mike proclaims, especially if it means freedom, \"and even if some good ones die/ Fuck it, the Lord'll sort 'em.\" Of course, Zack’s been on that tip for 20 years. Freedom? Still a lofty goal. -Marcus J. Moore, Pitchfork.com",
				"6gWv8qDLZUsNdUk6rAwlE0"));
		add(new Song(3L, "Tuf Tiddy", "Shredders", "Dangerous Jumps", "shredders.jpg", "Hip Hop", "November 03, 2017",
				"The opening track on Dangerous Jumps, 'Tuf Tiddy', does exactly what their name initially describes: shredding through bombastic production, with precise yet explosive wordplay. Nonethetheless, as the rhyme schemes are delivered at a nearly unbearable pace, and one-liners such as “Small world big city, tough titty,” see exciting first impressions quickly dissipate as the inauthenticity shows, and the whole idea of a Doomtree “reunion” seems queasy and weak. It should be said that the detail-oriented production impresses, but the washed-out aesthetic of these emcees, that never was all that charming to begin with, presents itself more blandly and troubling than ever before. -Timothy Michalik, thefourohfive.com",
				"7m5PB4JUh1dK4bYsLR442W"));
		add(new Song(4L, "Big Beast (ft. Bun B, T.I., and Trouble)", "Killer Mike", "R.A.P. Music", "killermike.jpg",
				"Hip Hop", "March 16, 2012",
				"In 2009, Adult Swim released ATL RMX, a well-intentioned but ultimately goofy attempt to merge Atlanta’s hardest rappers with indie producers. Later this year, their label, Williams Street Records, is set to release R.A.P. Music, a collaborative effort between Killer Mike and El-P; if first single \"Big Beast\" is any indication, they've definitely learned from ATL RMX’s mistakes. Misery loves company, and both Mike and El-P’s music have become increasingly dedicated to expressing joyfully righteous anger, whether you’re pissed at the government, your job, or just people in general. Mike warns anyone that speaks softer than him (in other words, everyone) about the warm welcome they can expect in Atlanta, Bun B recites his veteran credentials, and T.I. sounds cool as hell, despite hardly saying much. It’s more difficult than you think to get the latter two to sound this alive in 2012; clearly, they heard something in this monster El-P beat, which finds him reshaping sci-fi urban dystopia into something tactile and fearfully real. -Ian Cohen, Pitchfork.com",
				"44XV05LzPeL6nFtNabtBJt"));
		add(new Song(5L, "A Milli", "Lil Wayne", "Tha Carter III", "amilli.jpg", "Hip Hop", "March 11, 2008",
				"GREATREVIEW", "6ScJMrlpiLfZUGtWp4QIVt"));
		add(new Song(6L, "Back in Black", "AC/DC", "Back in Black", "acdc.jpg", "Rock", "December 21, 1980",
				"GREATREVIEW", "08mG3Y1vljYA6bvDt4Wqkj"));
		add(new Song(7L, "Immigrant Song", "Led Zeppelin", "Led Zeppelin III", "ledzep.jpg", "Rock", "November 5, 1970",
				"GREATREVIEW", "78lgmZwycJ3nzsdgmPPGNx"));
		add(new Song(8L, "Who Are you", "The Who", "Who Are You", "who.jpg", "Rock", "July 14, 1978", "GREATREVIEW",
				"02DurCgOvDdX0uKEjqcl3W"));
		add(new Song(9L, "(I Can't Get No) Satisfaction", "The Rolling Stones", "Out of Our Heads", "stones.jpg",
				"Rock", "May 12, 1965", "GREATREVIEW", "2PzU4IB8Dr6mxV3lHuaG34"));
		add(new Song(10L, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "queen.jpg", "Rock", "August 31, 1975",
				"GREATREVIEW", "7tFiyTwD0nx5a1eklYtX2J"));
	}

	public int size() {
		return songs.size();
	}

	public void add(Song song) {
		songs.put(song.getId(), song);
	}

//	public void add(Song underTest) {
//		return SongRepository.get(id);
//	}

	public boolean isEmpty() {
		return songs.isEmpty();
	}

	public Song findOne(Long id) {
		return songs.get(id);
	}

	public Collection<Song> findAll() {
		return songs.values();
	}

}