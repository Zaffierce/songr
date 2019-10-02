package com.Zaffierce.songr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface AlbumRepository extends JpaRepository<Album, Long> {
//    @Transactional
//    long deleteByTitle(String title);
}
