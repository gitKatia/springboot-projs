package com.kat.springboot.service;

import java.util.List;

import com.kat.springboot.domain.MusicBand;

public interface MusicBandService {
	
	List<MusicBand> findAll();
	MusicBand findByName(String name);
	MusicBand findById(long id);
	MusicBand create(MusicBand musicBand);
	MusicBand delete(long id);
	MusicBand edit(MusicBand musicBand, long id);
}
