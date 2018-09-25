package com.sdet.entities;


public class Player
{
		private String id;

		private String player_name=null;
		private String category=null;
		private String highestscore=null;
		private String bestfigure=null;
		private String team=null;

		public Player() {

		}
		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		public String getTeam() {
			return team;
		}

		public void setTeam(String team) {
			this.team = team;
		}

		public void setPlayer_name(String player_name) {
			this.player_name = player_name;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public void setHighestscore(String highestscore) {
			this.highestscore = highestscore;
		}

		public void setBestfigure(String bestfigure) {
			this.bestfigure = bestfigure;
		}

		public String getplayername() {
			return this.player_name;
		}
		public String getcategory() {
			return this.category;
		}
		public String gethighestscore() {
			return this.highestscore;
		}
		public String getbestfigure() {
			return this.bestfigure;
		}
		@Override
		public String toString()
		{
			return this.id+"    "+this.category+"    "+this.player_name;
		}

}
