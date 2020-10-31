package com.vimma.ciner.dao;

import com.vimma.ciner.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MovieDao extends JpaRepository<Movie,Integer> {
}
