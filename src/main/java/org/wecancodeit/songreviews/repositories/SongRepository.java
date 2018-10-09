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
				"As 2009, and the decade come to a close, PMA will be looking back at our favorite songs of the last ten years. We will update a list with 75 empty slots until we reach that song that changed everything. You can keep track of this list by keeping an eye on this page. We make these lists in hopes that you guys will chime in the comments and share your favorite musical moments of the noughties.\n"
						+ "\n"
						+ "Boasting a mind-bending Bangladesh beat and an utterly indispensable minimalistic pop hook, Weezy took it upon himself to make you forget you were listening to a high-profile hip hop album and took you back to his mixtape roots, where there weren’t any Jay-Z’s and Kanye’s and T-Pain’s in the post-production credits. Wayne goes on for three minutes and forty-two seconds about nothing at all, and could have gone for hours. There lies the genius in \"A Milli\"; you aren't listening to Lil Wayne's words but the raw energy oozing out of the track, leaving you hanging on to Wayne's staccato-like articulation and every heartbeat pause (there are many). Lil Wayne concludes the hyperbolic and ridiculously stupid and engrossing rap with “Don’t you compare me ’cause there ain’t anybody near me.” His claim will probably never be validated, but for these few minutes, his word is law.",
				"6ScJMrlpiLfZUGtWp4QIVt"));
		add(new Song(6L, "Back in Black", "AC/DC", "Back in Black", "acdc.jpg", "Rock", "December 21, 1980",
				"The first sound on Back in Black is the deep, ominous drone of church bells -- or \"Hell's Bells,\" as it were, opening the album and AC/DC's next era with a fanfare while ringing a fond farewell to Bon Scott, their late lead singer who partied himself straight to hell. But this implies that Back in Black is some kind of tribute to Scott, which may be true on a superficial level -- black is a funeral cover, hell's bells certainly signify death -- but this isn't filled with mournful songs about the departed. It's a more fitting tribute, actually, since AC/DC not only carried on without him, but they delivered a record that to the casual ear sounds like the seamless successor to Highway to Hell, right down to how Brian Johnson's screech is a dead ringer for Scott's growl. Most listeners could be forgiven for thinking that Johnson was Scott, but Johnson is different than Bon. He's driven by the same obsessions -- sex and drink and rock & roll, basically -- but there isn't nearly as much malevolence in his words or attitude as there was with Scott. Bon sounded like a criminal, Brian sounds like a rowdy scamp throughout Back in Black, which helps give it a real party atmosphere. Of course, Johnson shouldn't be given all the credit for Back in Black, since Angus and Malcolm carry on with the song-oriented riffing that made Highway to Hell close to divine. Song for song, they deliver not just mammoth riffs but songs that are anthems, from the greasy \"Shoot to Thrill\" to the pummeling \"Back in Black,\" which pales only next to \"You Shook Me All Night Long,\" the greatest one-night-stand anthem in rock history. That tawdry celebration of sex is what made AC/DC different from all other metal bands -- there was no sword & sorcery, no darkness, just a rowdy party, and they never held a bigger, better party than they did on Back in Black.",
				"08mG3Y1vljYA6bvDt4Wqkj"));
		add(new Song(7L, "Immigrant Song", "Led Zeppelin", "Led Zeppelin III", "ledzep.jpg", "Rock", "November 5, 1970",
				"No hard-rock song has ever had a more ominous opening line: \"We come from the land of the ice and snow.\" It was inspired by the band's concert in Iceland in June 1970, a month when the sun never fully sets. Plant started fantasizing about vikings and wrote in the voice of a Norse chieftain leading a sea invasion and expecting to die. It \"was supposed to be powerful and funny,\" he said. Page's menacing staccato riff could scare Thor into surrendering, and Plant's Tarzan holler adds another layer of primal barbarism.",
				"78lgmZwycJ3nzsdgmPPGNx"));
		add(new Song(8L, "Who Are you", "The Who", "Who Are You", "who.jpg", "Rock", "July 14, 1978",
				"And then there is “Who Are You,” a far stronger single than “Squeeze Box,” the hit from 1975’s The Who by Numbers, and a song that, stretched out over more than six minutes on the LP version, is far more moving than “Won’t Get Fooled Again,” the band’s certified Seventies masterpiece. The dynamics are much more subtle this time — and all the smugness is gone.\n"
						+ "\n"
						+ "“Who Are You” was spun out of the night that Townshend, already drunk after hours of financial haggling, half-recognized two members of the Sex Pistols in a bar: that is, he thought either Steve Jones or Paul Cook was Johnny Rotten. Corrected, he felt even more confused: Why can’t I see straight? Cook and Jones, supposedly arrogant young punks working out their rock & roll Oedipal complex, were thrilled to meet Townshend and horrified at what he had to tell them: the Who were finished, used up, wasted. The incident left Townshend passed out in a Soho street, which is where the song begins. Townshend (in the voice of Roger Daltrey) wakes up with one enormous question: Who are you? It’s addressed to Cook and Jones (Who are these upstarts, who would never have played a note had not Townshend picked up a guitar more than a decade back?); to the cop who, recognizing Townshend, sends him home without a bust (Who are the fans?); to himself (What does it mean to be a rocker? What kind of wreck has the life made him?); and, finally, to anyone who’s listening. “Whooooooo/Are you?” hums the chorus. “I really want to know!” Daltrey shouts back, echoing Donovan’s “What Goes On,” but while Donovan communicated hippie certainty that all things would come, Daltrey is desperate, sure of nothing.",
				"02DurCgOvDdX0uKEjqcl3W"));
		add(new Song(9L, "(I Can't Get No) Satisfaction", "The Rolling Stones", "Out of Our Heads", "stones.jpg",
				"Rock", "May 12, 1965", "GREATREVIEW", "2PzU4IB8Dr6mxV3lHuaG34"));
		add(new Song(10L, "Bohemian Rhapsody", "Queen", "A Night at the Opera", "queen.jpg", "Rock", "August 31, 1975",
				"The song “Bohemian Rhapsody”–which was released 40 years ago, Oct. 31, 1975–did not appear destined for the hit parade. It was, in TIME’s words, “a six-minute cut that mingles introspection with Gilbert and Sullivan operatics” by a band with little public profile. Yet it quickly topped the charts in England and propelled Queen on a 21-city U.S. tour.",
				"7tFiyTwD0nx5a1eklYtX2J"));
		add(new Song(11L, "Take 5", "Dave Bruebeck", "Time Out", "dave.jpg", "Jazz", "September 21, 1959",
				"While jazz is commonly regarded as a varied and complex genre of music for the acquired taste, this one song successfully brought the sound to the masses. Upon its release in 1959, the record rapidly made waves around the world – rightfully earning its status as the jazz movement’s defining hit.\n"
						+ "\n"
						+ "Aurally, the song is a masterpiece. So much so, it’s widely considered the most important jazz composition of all time. A simplistically suave piano motif plays throughout, with the quartet’s various instrumentalists all coming to the fore with skilful solo displays.\n"
						+ "\n" + "Even if you know nothing about jazz, you will know this song.",
				"1YQWosTIljIvxAgHWTp7KP"));
		add(new Song(12L, "So What", "Miles Davis", "Kind of Blue", "miles.jpg", "Jazz", "August 17, 1959",
				"If you’re looking for a master class in musicianship, then you’ve come to the right place. With Miles Davis leading the charge on trumpet, the late legend takes the listener on a sprawling journey of musical exploration. Anchored by his impeccable backing band, the track meanders along beautifully for over nine minutes of laid-back bliss.\n"
						+ "\n"
						+ "It’s a real testament to Miles Davis that the track remains as progressive as ever. Away from this standout hit, Davis will forever be remembered as a luminary in jazz. He was a forerunner of major stylistic developments in jazz over his five-decade career and his music continues to influence artists to this day.",
				"4vLYewWIvqHfKtJDk8c8tq"));
		add(new Song(13L, "Strange Fruit", "Billie Holiday", "Lady Sings The Blues", "billie.jpg", "Jazz",
				"June 06, 1956",
				"Here’s a challenge for you: Try listening to this song without feeling goose bumps all over. Can’t do it? We don’t blame you. That’s because this track is quite easily one of the most haunting pieces of music ever recorded. Despite only including around two minutes of actual singing, Billie Holiday’s vocal is utterly mesmerising. Taking the fore over a simple backing track, she proves her mettle as arguably the best jazz singer of all time.\n"
						+ "\n"
						+ "The lyrical content is just as compelling. Originally a poem penned in 1937 in protest of American racism, particularly the lynching of African Americans, Lady Day pours every sinew of her being into this track – impassionedly delivering a message very close to her heart.",
				"6W5706MsehAWMAZLIg9Fu2"));
		add(new Song(14L, "Acknowledgement", "John Coltrane", "A Love Supreme", "john.jpg", "Jazz", "January 1965",
				"Here’s another superb instrumental track, this time from the jazz saxophonist lovingly known as Trane. Somewhat of a musical odyssey, Acknowledgement forms the first part of the artist’s four-track magnum opus entitled A Love Supreme.\n"
						+ "\n"
						+ "Drenched with emotion, this expressive, beautiful record skitters along intensely – representing the artist’s personal struggle for purity. On a technical level, it’s also perfect. Created as a deeply spiritual piece of work, Coltrane’s avant-garde styling set an indomitable precedent for not only jazz, but artistry in general.",
				"0CLbmkYmQIWiEwnsbOkLpd"));
		add(new Song(15L, "Birdland", "Weather Report", "Heavy Weather", "weather.jpg", "Jazz", "March 1977",
				"For those who like their listening a bit funky, this is the song for you. Proudly at the forefront of the late 70s jazz-fusion boom, Birdland combines classic aspects of jazz with an electric, rockier sound to glorious effect.  \n"
						+ "\n"
						+ "When comparing a track of this ilk to earlier releases, it becomes salient just how flexible jazz can be. It’s also what makes the genre so difficult to classify. While some may say it’s a dying sound, the essence of jazz is still alive in so much of the music we hear today.",
				"19vVghIuHm3IAfN4xpRF3q"));
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