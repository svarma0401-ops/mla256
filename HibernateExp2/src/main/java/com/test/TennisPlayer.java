package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@DiscriminatorValue("Tennis_Player")
@Table(name = "tennis")
public class TennisPlayer extends Player{
		private int noOfMatches;
		private int wonMatches;
		
		public TennisPlayer()
		{
			super();
		}
		
		public TennisPlayer(int id, String name)
		{
			super(id,name);
		}
		
		public TennisPlayer(int id,String name, int noOfMatches,int wonMatches)
		{
			super(id,name);
			this.noOfMatches = noOfMatches;
			this.wonMatches = wonMatches;
		}

		public int getNoOfMatches() {
			return noOfMatches;
		}

		public void setNoOfMatches(int noOfMatches) {
			this.noOfMatches = noOfMatches;
		}

		public int getWonMatches() {
			return wonMatches;
		}

		public void setWonMatches(int wonMatches) {
			this.wonMatches = wonMatches;
		}

		@Override
		public String toString() {
			return "TennisPlayer [noOfMatches=" + noOfMatches + ", wonMatches=" + wonMatches + "]";
		}

		

		
		
		
}
