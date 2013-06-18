package it.prova.fantacalcio.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Team {

	
	@OneToMany
	protected List<Player> players;
	
	protected String name;
}
