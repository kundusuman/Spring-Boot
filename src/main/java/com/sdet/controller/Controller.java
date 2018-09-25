package com.sdet.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.sdet.entities.Player;
import com.sdet.service.SDETServiceImpl;


@RestController
@ComponentScan("com")

@RequestMapping("/api")
public class Controller {
	@Autowired
	SDETServiceImpl newimpl;
	
	
 
  @ResponseBody
  @PostMapping("/all")
  public Iterable<Player> shownode(@Valid @RequestBody String player2) {
		Gson gsonObj=new Gson();
		Player player=gsonObj.fromJson(player2, Player.class);
		String player1=player.getTeam();
		
	  return newimpl.getPlayer(player1); 
  }
  @ResponseBody
  @PostMapping("/add")
  public Iterable<Player> createNote(@Valid @RequestBody String player2) {
		Gson gsonObj=new Gson();
		Player player=gsonObj.fromJson(player2, Player.class);
		return newimpl.saveOrUpdate(player);
		
  }
}
