package com.kat.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kat.springboot.domain.MusicBand;
import com.kat.springboot.repository.MusicBandRepository;
import com.kat.springboot.web.exception.MusicBandIdMismatchException;
import com.kat.springboot.web.exception.MusicBandNotFoundException;

@Service
public class MusicBandServiceImpl implements MusicBandService {
	
	private MusicBandRepository musicBandRepository;
	
	@Autowired
	public MusicBandServiceImpl(MusicBandRepository musicBandRepository) {
		this.musicBandRepository = musicBandRepository;
	}

	@Override
	public List<MusicBand> findAll() {
		return musicBandRepository.findAll();
	}

	@Override
	public MusicBand findByName(String name) {
		return musicBandRepository.findByName(name);
	}

	@Override
	public MusicBand findById(long id) {
		return musicBandRepository
				.findById(id)
				.orElseThrow(MusicBandNotFoundException::new);
	}

	@Override
	public MusicBand create(MusicBand musicBand) {
		return musicBandRepository.save(musicBand);
	}

	@Override
	public MusicBand delete(long id) {
		MusicBand musicBand = musicBandRepository
				.findById(id)
				.orElseThrow(MusicBandNotFoundException::new);
		musicBandRepository.deleteById(id);
		return musicBand;
	}

	@Override
	public MusicBand edit(MusicBand musicBand, long id) {
		if(musicBand.getId() != id) {
			throw new MusicBandIdMismatchException("Music Band Id mismatch");
		}
		musicBandRepository
				.findById(id)
				.orElseThrow(MusicBandNotFoundException::new);
		return musicBandRepository.save(musicBand);
	}

}
