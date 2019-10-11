package main;

public class Rectangle {
	private Vertex v1, v2, v3, v4;
	
	public Rectangle(Vertex v1, Vertex v2, Vertex v3, Vertex v4) {	
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
		this.v4 = v4;
	}
	
	// Checks if the line intersects with the rectangle
	// Uses the method provided
	public boolean rectangleIntersect(Vertex u1, Vertex u2) {
		if(Vertex.linesIntersect(u1, u2, v1, v2) == true) return true;
		if(Vertex.linesIntersect(u1, u2, v1, v3) == true) return true;
		if(Vertex.linesIntersect(u1, u2, v1, v4) == true) return true;
		if(Vertex.linesIntersect(u1, u2, v2, v3) == true) return true;
		if(Vertex.linesIntersect(u1, u2, v2, v4) == true) return true;
		if(Vertex.linesIntersect(u1, u2, v3, v4) == true) return true;
		else return false;
	}
} // end class
