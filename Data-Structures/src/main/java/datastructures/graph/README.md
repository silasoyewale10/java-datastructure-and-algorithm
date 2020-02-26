# AUTHOR: SILAS OYEWALE
## Table of contents
Graph Implementation
### data-structures-and-algorithms

### Graph
<!-- Short summary or background information -->
Graph is a type of data structure to store non hierarchical connections. it is 
best optimized with an adjacency list where the connections each vertex has is 
stored as a linked list. Each node is called a vertex and the connection is called
an edge. 

### Challenge
<!-- Description of the challenge -->
Implement your own Graph. The graph should be represented as an adjacency list, and should include the following methods:

AddNode()
Adds a new node to the graph
Takes in the value of that node
Returns the added node
AddEdge()
Adds a new edge between two nodes in the graph
Include the ability to have a “weight”
Takes in the two nodes to be connected by the edge
Both nodes should already be in the Graph
GetNodes()
Returns all of the nodes in the graph as a collection (set, list, or similar)
GetNeighbors()
Returns a collection of nodes connected to the given node
Takes in a given node
Include the weight of the connection in the returned collection
Size()
Returns the total number of nodes in the graph

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
I declared a vertex, graph and edge class. I store the edges of each node in a arraylist and 
i store the vertexes of the graph in an array list. Each vertex has its own connections and its 
east to masintain like this. The big O is O(n).

## API
No API used for this project. 

# BREADTH FIRST TRAVERSAL OF A GRAPH
## CHALLENGE
Extend your graph object with a breadth-first traversal method that accepts a starting node.
Without utilizing any of the built-in methods available to your language, return a collection 
of nodes in the order they were visited. Display the collection.
## APPROACH AND EFFICIENCY
Create a hashSet for all seen nodes, create a queue for all nodes and create a list for all 
output in the right order and create a current node.
Iterate through the graph starting with the vertex the method takes in. Enqueue this vertex and add to seen. Dequeue this vertex and and save it to the current .
Add the current to the list of output. Run the getneighbor method on the vertex and repeat the above process for all the neighbors. Return output. 
## Big O
Space is O(1)
Time is O(n).
## TESTING
Write at least three test assertions for each method that you define.

# GETEDGE
## CHALLENGE
Write a function based on the specifications above, which takes in a graph, and an array of city names. Without utilizing any of the built-in methods available to your language, return whether the full trip is possible with direct flights, and how much it would cost.

## APPROACH AND EFFICIENCY
Create a variable to hold sum. Loop through the array to len-1. if the nodes are neighbors, loop through the edges. it this edge connects both cities, add the weight of the edge to the sum. return True and sum anf if they are not connected, return false $0. 
## BIG O
Time is O(n)
Space is O(1)

## API
No API needed for this code challenge. 

