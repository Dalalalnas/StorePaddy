package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public void playAction() {
	}
	
	void setName(String name) {
	}

	@Override
	public Player getTheOwner() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTheOwner(Player owner) {
		// TODO Auto-generated method stub
		
	}
}
