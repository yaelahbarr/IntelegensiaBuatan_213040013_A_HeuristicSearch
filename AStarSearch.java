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
public class AStarSearch {
    public void search(Node start, Node goal) {
        PriorityQueue<Node> openList = new PriorityQueue<>(Comparator.comparingInt(node -> node.getCost() + node.getHeuristic()));
        Map<Node, Node> parentMap = new HashMap<>(); // To keep track of the parent nodes

        start.setCost(0);
        openList.add(start);

        while (!openList.isEmpty()) {
            Node current = openList.poll();

            if (current.equals(goal)) {
                // Path found
                List<Node> path = reconstructPath(parentMap, current);
                printPath(path);
                return;
            }

            for (Node neighbor : current.getTetangga()) {
                int tentativeCost = current.getCost() + 1; // Assuming a uniform cost

                if (tentativeCost < neighbor.getCost()) {
                    neighbor.setCost(tentativeCost);
                    openList.add(neighbor);
                    parentMap.put(neighbor, current); // Update the parent
                }
            }
        }

        System.out.println("No path found.");
    }

    private List<Node> reconstructPath(Map<Node, Node> parentMap, Node goal) {
        List<Node> path = new ArrayList<>();
        Node current = goal;

        while (current != null) {
            path.add(current);
            current = parentMap.get(current); // Get the parent node
        }

        Collections.reverse(path);
        return path;
    }

    private void printPath(List<Node> path) {
        System.out.println("A* Path:");
        for (Node node : path) {
            System.out.print(node.getNilai() + " -> ");
        }
        System.out.println();
    }
}
