/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntelegensiaBuatan2;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author wdead
 */
public class Node {
    private String nilai;
    private List<Node> tetangga;
    private int heuristic; // Add heuristic value
    private int cost; // Add cost from the start node

    public Node(String nilai, int heuristic) {
        this.nilai = nilai;
        this.tetangga = new ArrayList<>();
        this.heuristic = heuristic;
        this.cost = Integer.MAX_VALUE;
    }

    public String getNilai() {
        return nilai;
    }

    public List<Node> getTetangga() {
        return tetangga;
    }

    public void addTetangga(Node node) {
        tetangga.add(node);
    }

    public int getHeuristic() {
        return heuristic;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
