package com.kat.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.kat.springboot.domain.MusicBand;
import com.kat.springboot.service.MusicBandService;

@RestController
@RequestMapping("/api/musicbands")
public class MusicBandController {
	
	private MusicBandService musicBandService;
	
	@Autowired
	public MusicBandController(MusicBandService musicBandService) {
		this.musicBandService = musicBandService;
	}
	
    @GetMapping	
	public List<MusicBand> getAll() {
		return musicBandService.findAll();
	}
    
    @GetMapping("/name/{name}")
	public MusicBand getByName(@PathVariable("name") String name) {
		return musicBandService.findByName(name);
	}
    
    @GetMapping("/{id}")
	public MusicBand getOne(@PathVariable("id") long id) {
		return musicBandService.findById(id);
	}
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
	public MusicBand create(@RequestBody MusicBand musicBand) {
		return musicBandService.create(musicBand);
	}
    
    @DeleteMapping("/{id}")
	public MusicBand deleteOne(long id) {
		return musicBandService.delete(id);
	}
    
    @PutMapping("/{id}")
	public MusicBand update(@RequestBody MusicBand musicBand, @PathVariable("id") long id) {
		return musicBandService.edit(musicBand, id);
	}

}
