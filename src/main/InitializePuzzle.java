package main;

import java.util.ArrayList;

public class InitializePuzzle {

	public InitializePuzzle() { }

	// Initializes all start points
	public ArrayList<Vertex> initStart() {
		ArrayList<Vertex> startPoint = new ArrayList<>();
		startPoint.add(new Vertex(17, 2));
		startPoint.add(new Vertex(16, 14));
		startPoint.add(new Vertex(15, 14));
		startPoint.add(new Vertex(11, 22));
		startPoint.add(new Vertex(11, 21));
		startPoint.add(new Vertex(22, 3));
		startPoint.add(new Vertex(22, 2));
		startPoint.add(new Vertex(20, 3));
		startPoint.add(new Vertex(17, 21));
		startPoint.add(new Vertex(17, 20));
		startPoint.add(new Vertex(15, 21));
		startPoint.add(new Vertex(12, 21));
		return startPoint;
	}

	// Initializes all end points
	public ArrayList<Vertex> initEnd() {
		ArrayList<Vertex> endPoints = new ArrayList<>();
		endPoints.add(new Vertex(11, 20));
		endPoints.add(new Vertex(8, 22));
		endPoints.add(new Vertex(8, 20));
		endPoints.add(new Vertex(15, 2));
		endPoints.add(new Vertex(19, 13));
		endPoints.add(new Vertex(15, 21));
		endPoints.add(new Vertex(12, 21));
		endPoints.add(new Vertex(11, 21));
		endPoints.add(new Vertex(20, 2));
		endPoints.add(new Vertex(17, 2));
		endPoints.add(new Vertex(16, 14));
		endPoints.add(new Vertex(15, 14));
		return endPoints;
	}

	public ArrayList<Vertex> initVertex() {
		ArrayList<Vertex> vertex = new ArrayList<>();
		// Rectangle 0:
		vertex.add(new Vertex(5, 14));
		vertex.add(new Vertex(5, 16));
		vertex.add(new Vertex(10, 16));
		vertex.add(new Vertex(10, 14));
		// Rectangle 1:
		vertex.add(new Vertex(4, 4));
		vertex.add(new Vertex(4, 8));
		vertex.add(new Vertex(5, 8));
		vertex.add(new Vertex(5, 4));
		// Rectangle 2:
		vertex.add(new Vertex(19, 11));
		vertex.add(new Vertex(19, 13));
		vertex.add(new Vertex(23, 13));
		vertex.add(new Vertex(23, 11));
		// Rectangle 3:
		vertex.add(new Vertex(15, 14));
		vertex.add(new Vertex(15, 17));
		vertex.add(new Vertex(16, 17));
		vertex.add(new Vertex(16, 14));
		// Rectangle 4:
		vertex.add(new Vertex(14, 15));
		vertex.add(new Vertex(14, 18));
		vertex.add(new Vertex(22, 18));
		vertex.add(new Vertex(22, 15));
		// Rectangle 5:
		vertex.add(new Vertex(3, 19));
		vertex.add(new Vertex(3, 22));
		vertex.add(new Vertex(4, 22));
		vertex.add(new Vertex(4, 19));
		// Rectangle 6:
		vertex.add(new Vertex(19, 13));
		vertex.add(new Vertex(19, 22));
		vertex.add(new Vertex(22, 22));
		vertex.add(new Vertex(22, 13));
		// Rectangle 7:
		vertex.add(new Vertex(8, 20));
		vertex.add(new Vertex(8, 22));
		vertex.add(new Vertex(11, 22));
		vertex.add(new Vertex(11, 20));
		// Rectangle 8:
		vertex.add(new Vertex(12, 13));
		vertex.add(new Vertex(12, 21));
		vertex.add(new Vertex(15, 21));
		vertex.add(new Vertex(15, 13));
		// Rectangle 9:
		vertex.add(new Vertex(16, 16));
		vertex.add(new Vertex(16, 17));
		vertex.add(new Vertex(20, 17));
		vertex.add(new Vertex(20, 16));
		// Rectangle 10:
		vertex.add(new Vertex(15, 2));
		vertex.add(new Vertex(15, 8));
		vertex.add(new Vertex(17, 8));
		vertex.add(new Vertex(17, 2));
		// Rectangle 11:
		vertex.add(new Vertex(20, 2));
		vertex.add(new Vertex(20, 3));
		vertex.add(new Vertex(22, 3));
		vertex.add(new Vertex(22, 2));
		// Rectangle 12:
		vertex.add(new Vertex(4, 20));
		vertex.add(new Vertex(4, 21));
		vertex.add(new Vertex(6, 21));
		vertex.add(new Vertex(6, 20));
		// Rectangle 13:
		vertex.add(new Vertex(8, 3));
		vertex.add(new Vertex(8, 7));
		vertex.add(new Vertex(9, 7));
		vertex.add(new Vertex(9, 3));
		// Rectangle 14:
		vertex.add(new Vertex(11, 20));
		vertex.add(new Vertex(11, 21));
		vertex.add(new Vertex(17, 21));
		vertex.add(new Vertex(17, 20));
		// Rectangle 15:
		vertex.add(new Vertex(7, 17));
		vertex.add(new Vertex(7, 20));
		vertex.add(new Vertex(12, 20));
		vertex.add(new Vertex(12, 17));

		return vertex;
	}
}
