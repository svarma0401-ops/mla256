package com.dsgn;

abstract class TemplateMethods{
	public abstract void players();
	public abstract void playerInfo();
	public final void completeTeam() {
		this.players();
		this.playerInfo();
	}
}

class PlayerInfoImpl extends TemplateMethods{
	@Override
	public void players() {
		System.out.println("Players Data not added");
	}
	
	@Override
	public void playerInfo() {
		System.out.println("PlayerInfo Overrided");
	}
}

class PlyersImpl extends TemplateMethods{
	@Override
	public void players() {
		System.out.println("Players Data from impl2");
	}
	
	@Override
	public void playerInfo() {
		System.out.println("Player Info from Impl2");
	} 
}
public class TemplateDemo {

	public static void main(String[] args) {
		
		TemplateMethods obj1 = new PlayerInfoImpl();
		TemplateMethods obj2 = new PlyersImpl();
		
		obj1.completeTeam();
		obj2.completeTeam();
	}

}
