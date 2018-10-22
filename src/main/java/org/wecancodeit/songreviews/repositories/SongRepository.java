package org.wecancodeit.songreviews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.songreviews.model.Song;

public interface SongRepository extends CrudRepository<Song, Long> {

}
