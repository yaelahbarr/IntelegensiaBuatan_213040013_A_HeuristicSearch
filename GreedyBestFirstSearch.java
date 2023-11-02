/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntelegensiaBuatan2;

import java.util.*;
/**
 *
 * @author wdead
 */
public class GreedyBestFirstSearch {
    
    public void search(Node start, Node goal) {
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingInt(node -> node.getHeuristic()));
        Set<Node> closedSet = new HashSet<>();

        openList.add(start);

        while (!openList.isEmpty()) {
            Node current = openList.poll();

            if (current.equals(goal)) {
                // Path found
                List<Node> path = reconstructPath(current);
                printPath(path);
                return;
            }

            closedSet.add(current);

            for (Node neighbor : current.getTetangga()) {
                if (closedSet.contains(neighbor)) {
                    continue;
                }

                if (!openList.contains(neighbor)) {
                    openList.add(neighbor);
                }
            }
        }

        System.out.println("No path found.");
    }

    private List<Node> reconstructPath(Node goal) {
        List<Node> path = new ArrayList<>();
        Node current = goal;

        while (current != null) {
            path.add(current);
            if (path.size() >= 2) {
                current = path.get(path.size() - 2); 
            } else {
                current = null;
            }
        }

        Collections.reverse(path);
        return path;
    }

    private void printPath(List<Node> path) {
        System.out.println("Greedy Best-First Search Path:");
        for (Node node : path) {
            System.out.print(node.getNilai() + " -> ");
        }
        System.out.println();
    }
    
}
