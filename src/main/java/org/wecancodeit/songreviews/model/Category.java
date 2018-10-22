package org.wecancodeit.songreviews.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String category;
	private String image;

	@OneToMany(mappedBy = "category")
	private Set<Song> reviews = new HashSet<Song>();

	public Set<Song> getSongs() {
		return reviews;

	}

	public Category() {
	}

	public Category(String category, String image) {
		this.category = category;
		this.image = image;

	}

	public String getImage() {
		return image;
	}

	public Set<Song> getReviews() {
		return reviews;
	}

	public Long getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return category;
	}

}
