package org.wecancodeit.songreviews.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@ID
	@GeneratedValue
	private Long id;
	private String name;

	@OneToMany(mappedBy = "category")
	private Set<Song> reviews = new HashSet<Song>();

	public Set<Song> getSongs() {
		return reviews;

	}

	public Category() {
	}

	public Category(String category) {
		this.name = category;

	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}

}
