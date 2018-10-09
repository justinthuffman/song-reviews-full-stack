package org.wecancodeit.songreviews.model;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String artist;
	private String album;
	private String image;
	private String releaseDate;
	private String content;
	private String uri;

	@ManyToOne
	private String category;

	public Category getCategory() {
		return category;
	}

	public Song(Long id, String name, String artist, String album, String image, String category, String releaseDate,
			String content, String uri) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.image = image;
		this.category = category;
		this.releaseDate = releaseDate;
		this.content = content;
		this.uri = uri;
	}

	public Song() {
	}

//	public Song(long id) {
//		super();
//		this.id = id;
//		this.name = "Them good beats";
//		this.artist = "Song guy";
//		this.album = "Great collection of songs";
//		this.image = "";
//		this.category = "Rock";
//		this.releaseDate = "November 3, 1981";
//		this.content = "dope review";
//	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getImage() {
		return image;
	}

//	public String getCategory() {
//		return category;
//	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getContent() {
		return content;
	}

	public String getUri() {
		return uri;
	}
}
