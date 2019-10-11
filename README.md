# Path-finding using depth first algoritm

A table of 16 rectangles is given. Goal of this algorithm is to efficiently find path from A to B, while following the rules specified in problem definition.

## Problem definition

This table will give the vertices of your 16 rectangles (actually the ones illustrated on the previous page).The  document  will  also  contain  12  navigation  puzzles,  as  in  the  table  given  above  to  the  right.   Yourmission, should you decide to accept it1, is to generate solutions for each of the 12 problems. Each solutionshould be written to a separate output file and placed in the submission directory detailed below (not asubdirectory). For example, for problem 0, you will need to generate0.txtwhich contains either:(8, 23) (11, 23) (10, 19) (6, 18) (13, 10) (12, 10)or any other sequence of line segments which connects coordinate(8,23)to(12,10).Note that a single space separates each coordinate and the coordinates are themselves formatted witha single space following the comma. Since part of the assessment will be automatically marked, it is vitalthat you conform to this format otherwise 0 marks will be awarded automatically.  To de-risk formatting,you are advised to check each of your solutions usingFormatChecker.javawhich is supplied onthe course webpage.  You should check your solutions before and after copying them to the submissiondirectory (not a subdirectory). You are also advised to check your solutions using the diagram provided inthe pdf document.You  are  free  to  make  use  ofVertex.javawhich  is  available  on  the  webpage.Vertexpro-vides the functionlinesIntersect(Vertex u1, Vertex u2, Vertex v1, Vertex v2)for checking whether the line between two verticesu1andu2intersects with the line betweenv1andv2.  The class also provides the functionvertexIntersect(Vertex u, Vertex v1, Vertexv2)to check whetheruoccurs on the line betweenv1andv2.Vertexis specifically designed to supportthis assessment; you are advised to read and carefully consider the comments given in this source code.

Errors to be avoided:
```
Adding a deja va (been here before) check tonextConfigs– the role ofnextConfigsis merelyto define the adjacent states;
```
```
Deploying a complicated search algorithm without first implementing a simple one;
```
```
Not devoting enough time to considering how a journey can navigate around the obstacles (and soend up with annextConfigsmethod which is incomplete or buggy);
```
```
Implement  a  search  algorithm  which  has  poor  space  behaviour  such  as  Dijkstra’s  algorithm  orbreadth-first search; another mistake would be to implement A* search without a clear (documented)explanation as to why a heuristic is admissible
```