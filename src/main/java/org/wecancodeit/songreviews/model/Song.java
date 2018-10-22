package org.wecancodeit.songreviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Song {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String artist;
	private String album;
	private String image;

	@ManyToOne
	private Category category;

	private String releaseDate;

	@Lob
	private String content;
	private String uri;

	public Song(String name, String artist, String album, String image, Category category, String releaseDate,
			String content, String uri) {
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

	public Category getCategory() {
		return category;
	}

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
