package com.sdet.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.sdet.entities.Player;

/**
 * 
 * This interface defines the rules to be implemented as business layer
 */
public interface SDETService {

	//void transferMoney();
	public ArrayList<Player> saveOrUpdate(Player player);
	public ArrayList<Player> getPlayer(String team)  ;
	public boolean check(Player player)throws SQLException;
	public boolean checkT(String team) throws SQLException;

}
