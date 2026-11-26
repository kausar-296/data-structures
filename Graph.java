/* graph- a grp of vertices (nodes) connected to each other with edges
edges are of two types - directed and undirected 
directed (->) n undirected (-)
a collection of vertices connected with edges either by using directed or undirected edges.
g(5,6) == 5 vertices and 6 edges

adjacency matrix-
consider matrix 5x5 for 5 vertices
0 1 1 0 0
1 0 0 1 1
1 0 0 1 0
0 1 1 0 1
0 1 0 1 0

graph is G(V: 5,E: 6)
0----1------4
|     |     |
2-----3-----

TYPES OF GRAPH-
it is a graph in which edges will be undirected (undireected graph)
ex- 0----1
    | \ |
    2---3

adjacency matrix-
0 1 1 1
1 0 0 1 
1 0 0 1
1 1 1 0

it is a graph in which edges will be directed (directed graph) 
graph in which every edge will have some weight (weighted graph) <used in google maps>
graph in which edges will not have any weight (unweighted graph) default weight is 1
graph in which there must be atleast one cyclic path (cyclic graph) 
graph in which there is no cyclic path (acyclic graph)

DIFFERENCE BETWEEN A TREE AND A GRAPH
- A tree can't be cyclic and must be connected, while a graph can be cyclic and may not be connected.
- every tree is a graph, but not every graph is a tree.
- a tree is a directed, unweighted and acyclic graph.

GRAPH TRAVERSAL-
DFS (Depth-First Search)
BFS (Breadth-First Search)

DFS-
- we use stack data structure
- create a stack and another array to keep track of visited nodes
- ex- 0----1------4
     |     |   \
     2-----3-----5

    visited array- [0,1,2,3,4,5] == [F,F,F,F,F,F]
    stack- [0,1,3,2,4,5]

    we start from 0 (Source vertex, can be any vertex), push it to stack and mark it as visited, 
    then we go to 1, push it to stack and mark it as visited, 
    then we go to 3, push it to stack and mark it as visited, 
    then we go to 2, push it to stack and mark it as visited, 
    then we go to 4, push it to stack and mark it as visited, 
    then we go to 5, push it to stack and mark it as visited.

BFS- 
- we use queue data structure
*/

import java.util.*;

public class Graph {
    public static void dfs(int [][] adj, int src, int v) {
        Stack<Integer> s= new Stack<>();
        boolean [] vis= new boolean[v];
        s.push(src);
        vis[src] = true;
        while(!s.isEmpty()) {
            int curr = s.peek();
            System.out.print(curr + " ");
            boolean flag = false;
            for(int i=0; i<v-1; i++) {
                if(adj[curr][i] == 1 && !vis[i]) {
                    s.push(i);
                    vis[i] = true;  
                    flag = true;
                    break;
                }
                
            }
            if(!flag) {
                s.pop();
            }
        }
    }

    public static void main(String[] arg) {
        int [] [] adj= {
            {0, 1, 1, 0, 0},
            {1, 0, 1, 1, 1},
            {1, 1, 0, 1, 0},
            {0, 1, 1, 0, 1},
            {0, 1, 0, 1, 0}
        };
        System.out.println("DFS Traversal of the graph is: ");
        dfs(adj, 2, 5);
    }
}
