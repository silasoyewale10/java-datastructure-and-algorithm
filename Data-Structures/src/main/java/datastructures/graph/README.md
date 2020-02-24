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
