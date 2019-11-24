package com.kat.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kat.springboot.domain.MusicBand;

public interface MusicBandRepository extends JpaRepository<MusicBand, Long> {
	MusicBand findByName(String name);
}
