package org.wecancodeit.songreviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.songreviews.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
