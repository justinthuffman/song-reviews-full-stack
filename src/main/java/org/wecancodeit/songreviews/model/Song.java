package org.wecancodeit.songreviews.model;

public class Song {
	private Long id;
	private String name;
	private String artist;
	private String album;
	private String albumImgUrl;
	private String category;
	private String releaseDate;
	private String content;

	public Song(Long id, String name, String artist, String album, String albumImgUrl, String category,
			String releaseDate, String content) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.albumImgUrl = albumImgUrl;
		this.category = category;
		this.releaseDate = releaseDate;
		this.content = content;
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

	public String getAlbumImgUrl() {
		return albumImgUrl;
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
