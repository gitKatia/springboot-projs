package com.kat.springboot.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class MusicBand {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private long yearCreated;
	
	@Enumerated(EnumType.STRING)
	private Genre genre;
	
	@ManyToMany
	@JoinTable(name="band_member", 
	joinColumns=@JoinColumn(name="band_id"),
	inverseJoinColumns=@JoinColumn(name="member_id"))
	Set<Member> members;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getYearCreated() {
		return yearCreated;
	}
	
	public void setYearCreated(long yearCreated) {
		this.yearCreated = yearCreated;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public Set<Member> getMembers() {
		return members;
	}
	
	public void setMembers(Set<Member> members) {
		this.members = members;
	}
	
}
