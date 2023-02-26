package io.github.eng_gabrielscardoso.models;

import java.util.ArrayList;
import java.util.List;

public class Field {

	private boolean isFlaged;
	private boolean isMined;
	private boolean isOpened;

	private final int coordinateX, coordinateY;
	
	private List<Field> neighbourhood = new ArrayList<Field>();
	
	Field(int coordinateX, int coordinateY) {
		this.coordinateX = coordinateX;
		this.coordinateY = coordinateY;
	}

	protected boolean isFlaged() {
		return this.isFlaged;
	}

	protected void setFlaged(boolean isFlaged) {
		this.isFlaged = isFlaged;
	}
	
	protected boolean isMined() {
		return this.isMined;
	}

	protected void setMined(boolean isMined) {
		this.isMined = isMined;
	}
	
	protected boolean isOpened() {
		return this.isOpened;
	}
	
	protected void setOpened(boolean isOpened) {
		this.isOpened = isOpened;
	}

	protected int getCoordinateX() {
		return coordinateX;
	}

	protected int getCoordinateY() {
		return coordinateY;
	}
	
	protected List<Field> getNeighbourhood() {
		return this.neighbourhood;
	}
	
	protected void setNeighbourhood(ArrayList<Field> neighbourhood) {
		this.neighbourhood = neighbourhood;
	}
	
	protected boolean addNeighbour(Field neighbour) {
		boolean isNeighbourCoordinateXDifferent = this.getCoordinateX() != neighbour.getCoordinateX();
		boolean isNeighbourCoordinateYDifferent = this.getCoordinateY() != neighbour.getCoordinateY();
		boolean isDiagonal = isNeighbourCoordinateXDifferent && isNeighbourCoordinateYDifferent;
		
		int deltaCoordinateX = Math.abs(this.getCoordinateX() - neighbour.getCoordinateX());
		int deltaCoordinateY = Math.abs(this.getCoordinateY() - neighbour.getCoordinateY());
		int deltaTotal = deltaCoordinateX + deltaCoordinateY;
		
		if(deltaTotal == 1 && !isDiagonal) {
			this.getNeighbourhood().add(neighbour);
			return true;
		}
		
		if(deltaTotal == 2 && isDiagonal) {
			this.getNeighbourhood().add(neighbour);
			return true;
		}
		
		return false;
	}

}
