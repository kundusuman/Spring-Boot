package com.sdet.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.sdet.dao.*;
import com.sdet.entities.Player;

/**
 * This class implements the business rules defined for business layer in
 * SDETService interface
 *
 */
@Service
public class SDETServiceImpl implements SDETService {

	@Override
	public ArrayList<Player> saveOrUpdate(Player player)
	{
		ArrayList<Player> list=new ArrayList<Player>();
		SDETDao dao = new SDETDaoImpl();
		try {
			if(checkT(player.getTeam())==false)
			{
				Player p=new Player();
				p.setCategory("Invalid Team Exception");
				list.add(p);
				return list;
				
			}
			if(bBestcheck(player.getbestfigure())==false)
			{
				Player p=new Player();
				p.setCategory("wrong best figure exception best figure should like 9/12");
				list.add(p);
				return list;
				
			}
			try 
			{
				if(player.getcategory().equalsIgnoreCase("batsman") && Integer.parseInt(player.gethighestscore())<50)
				{
					Player p=new Player();
					p.setCategory("not a batsman exception");
					list.add(p);
					return list;
					
				}
			}
			catch(Exception e)
			{
				Player p=new Player();
				p.setCategory("wrong highscore input exception highscore should be  a number");
				list.add(p);
				return list;
				
			}
			if(!player.getcategory().equalsIgnoreCase("batsman") && !player.getcategory().equalsIgnoreCase("bowler") && !player.getcategory().equalsIgnoreCase("allrounder"))
			{
				Player p=new Player();
				p.setCategory("Invalid category exception");
				list.add(p);
				return list;
				
			}
			if(check(player))
			{
				Player p=new Player();
				p.setCategory("Duplicate player Exception");
				list.add(p);
				return list;
				
			}
			return dao.saveOrUpdate(player);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Player p=new Player();
			p.setCategory("SQl Exception");
			list.add(p);
			return list;
		}
	}

	public ArrayList<Player> getPlayer(String team)  
	{
		
		SDETDao dao = new SDETDaoImpl();
		ArrayList<Player> list=new ArrayList<Player>();
		try {
			if(dao.checkT(team)==false)
			{
				Player p=new Player();
				p.setCategory("Invalid Team");
				list.add(p);
				return list;
				
			}
			return dao.getPlayer(team);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			Player p=new Player();
			p.setCategory("SQl Exception");
			list.add(p);
			return list;
		}
		
	}
	public boolean check(Player player) throws SQLException
	{
		SDETDao dao = new SDETDaoImpl();
			return dao.check(player);
	}
	public boolean checkT(String team) throws SQLException
	{
		SDETDao dao = new SDETDaoImpl();
		return dao.checkT(team);
	}
	private boolean bBestcheck(String s) {
		try {
			String[] arr = s.split("/");
			if (arr.length != 2)
				return false;
			int f = Integer.parseInt(arr[0]);
			if (f > 10)
				return false;
			int f1 = Integer.parseInt(arr[1]);

			return true;

		} catch (Exception e) {
			return false;
		}
	}
}
