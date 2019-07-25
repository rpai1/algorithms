package strings;

import java.io.*;
import java.util.*;

class Graph{

    private LinkedList<Integer>[] adjList;

    Graph(int vertices){
        adjList = new LinkedList[vertices];

        for(int vertexIndex = 0; vertexIndex< vertices; vertexIndex++){
            adjList[vertexIndex] = new LinkedList<>();
        }
    }

    void addEdge( int startVertex, int endVertex){
        adjList[startVertex].add(endVertex);
    }

    void topologicalSortUtil(int curVertex, boolean[] visited, Stack<Integer> stack){

        visited[curVertex] = true;

        for(int adjVertex : adjList[curVertex]){
            if(visited[adjVertex] == false){
                topologicalSortUtil(adjVertex, visited, stack);
            }
        }
        stack.push(curVertex);
    }

    void topologicalSort(){
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[adjList.length];

        Arrays.fill(visited, false);

        for(int i=0;i<adjList.length;i++){
            if(visited[i] == false){
                topologicalSortUtil(i, visited, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print((char)(stack.pop() + 'a') + " ");
        }
    }
}
class PrintOrderInAlianLanguage{
    private static void printOrder(String[] words, int len){

        Graph graph = new Graph(len);

        for(int i=0;i<words.length-1;i++){

            String word1 = words[i];
            String word2 = words[i+1];

            for(int j=0;j<Math.min(word1.length(), word2.length()); j++){
                if(word1.charAt(j) != word2.charAt(j)){
                    graph.addEdge(word1.charAt(j) -'a', word2.charAt(j) - 'a');
                    break;
                }
            }

        }
        graph.topologicalSort();

    }

    public static void main(String[] args)
    {
        String[] words = {"caa", "aaa", "aab"};
        printOrder(words, words.length);
    }
}
