package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GamenMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GamenMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GamenMinDTO> dto = result.stream().map(x -> new GamenMinDTO(x)).toList();
		return dto;
	}
	
}
