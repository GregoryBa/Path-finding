package main;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

import javax.jws.Oneway;

/*
 * ----- Assessment 2 -----
 * GB430 ; Gregory Baranowski  
 */

public class JourneyPlanner {
	public static ArrayList<Vertex> vertex = new ArrayList<>();				// List of all vertexes
	public static ArrayList<Vertex> startPoints = new ArrayList<>();		// List of all start points
	public static ArrayList<Vertex> endPoints = new ArrayList<>();			// List of all end points
	public static LinkedList<Rectangle> rectangles = new LinkedList<>();	// List of all rectangles

	final static int vertexLength = 60;
	final static int puzzleLength = 12;
	
	public static void main(String[] args) throws FileNotFoundException {
		InitializePuzzle init = new InitializePuzzle();
		// Initiates all lists
		vertex = init.initVertex();
		startPoints = init.initStart();
		endPoints = init.initEnd();
		rectangles = initRectangles();
		String routeString;
		
		for (int i = 0; i < puzzleLength; i++) { 
			PrintWriter writer = new PrintWriter(i + ".txt");
			JourneyPlanner planner = new JourneyPlanner();
			System.out.println("------------      PUZZLE NR :  "  + (i + 1) + 
							   "      START :  " + startPoints.get(i).toString() + 
							   "      END :  "+  endPoints.get(i).toString() + "      ------------  ");
			
			// Start searching for the shortest route
			LinkedList<Vertex> routeVertex = planner.iterativeDeepening(startPoints.get(i), endPoints.get(i));
			
			
			// Code below is for parsing the string in order to fit to initial request
			routeString = routeVertex.toString();
			routeString = routeString.substring(1, routeString.length() -1);	// Gets rid of [ and ] in final answer
			StringBuilder route = new StringBuilder(routeString);	// Uses stringBuilder to be able to use deleteChatAt function
			char comma;
			for (int j = 0; j < route.length() -1; j++) {	// Gets rid of all occurrences of comma behind
															// the ")" character.
				comma = route.charAt(j);
				if (comma == ')') {
					route.deleteCharAt(j + 1);
				}
			}
				
			System.out.println("Route: " + route);
			writer.println(route);
			writer.close();
		}
	} 
	
	// Rewrote nextConfigs method given.
	private List<Vertex> nextConfigs(Vertex state) {
		List<Vertex> nextStates = new LinkedList<Vertex>();
		
		for (int i = 0; i < vertexLength; i++) {
			Vertex posState = new Vertex(vertex.get(i).get_x(), vertex.get(i).get_y());
			// Check if our new candidate solution is valid
			if(checkValid(state, posState) == true) nextStates.add(posState); 
		}
		return nextStates;
	}
	
	private boolean checkValid(Vertex start, Vertex newMove) {
		// Check that we are not trying to move to 
		// the same position
		if(start.equals(newMove)) {	return false; }
		
		// Check if none of the rectangles intersects with the 
		// line between start and newState
		for (Rectangle r: rectangles) {	
			if(r.rectangleIntersect(start, newMove)) return false; 
		}
		
		return true;
	}
	
	// Used the method provided by you
    private LinkedList<Vertex> iterativeDeepening(Vertex first, Vertex last) {
    	for (int depth = 1; true; depth++) {
    		LinkedList<Vertex> routeVertex = depthFirst(first, last, depth);
    		if (routeVertex != null) return routeVertex;
    	}
    }
    
    // Used the method provided by you, small changes made in order to fit to my problem
    private LinkedList<Vertex> depthFirst(Vertex first, Vertex last, int depth) {
    	
    	if (depth == 0) { return null; }
    	
    	else if (first.equals(last)) {    
    		LinkedList<Vertex> routeVertex = new LinkedList<Vertex>();
    		routeVertex.add(first);
    		return routeVertex;
    	}
    	
    	else {   
    		List<Vertex> nexts = nextConfigs(first);
   
    		for (Vertex next:nexts) {   
    			LinkedList<Vertex> routeVertex = depthFirst(next, last, depth - 1);
    			if (routeVertex != null)
    			{
    				//System.out.println("ADDED FIRST: " + first);
    				routeVertex.addFirst(first);
    				return routeVertex;
    			}
    		}
    		return null;
    	}
    } 
    
    // Initialize the rectangle list
	private static LinkedList<Rectangle> initRectangles() {
    	for (int i = 1; i < 65; i++) {
    		// Each 4th of all vertexes, add 4 previous vertexes to the rectangle-list
    		if(((i) % 4) == 0 && i != 0) {	
    			Rectangle r = new Rectangle(vertex.get(i - 4), vertex.get(i - 3), 
    										vertex.get(i - 2), vertex.get(i - 1));
    			rectangles.add(r);
    		}
		}
    	return rectangles;
    }
} // end class