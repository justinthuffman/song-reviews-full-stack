package org.wecancodeit.songreviews.model;

public class Song {
	private Long id;
	private String name;
	private String artist;
	private String album;
	private String image;
	private String category;
	private String releaseDate;
	private String content;

	public Song(Long id, String name, String artist, String album, String image, String category, String releaseDate,
			String content) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.image = image;
		this.category = category;
		this.releaseDate = releaseDate;
		this.content = content;
	}

	public Song(long id) {
		super();
		this.id = id;
		this.name = "Them good beats";
		this.artist = "Song guy";
		this.album = "Great collection of songs";
		this.image = "";
		this.category = "Rock";
		this.releaseDate = "November 3, 1981";
		this.content = "dope ass review";
	}

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

	public String getCategory() {
		return category;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getContent() {
		return content;
	}
}
