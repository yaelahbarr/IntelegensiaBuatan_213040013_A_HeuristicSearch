/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IntelegensiaBuatan2;

/**
 *
 * @author wdead
 */
public class Main {
    public static void main(String[] args) {
        Node arad = new Node("Arad", 366);
        Node bucharest = new Node("Bucharest", 0);
        Node craiova = new Node("Craiova", 160);
        Node dobreta = new Node("Dobreta", 242);
        Node eforie = new Node("Eforie", 161);
        Node fagaras = new Node("Fagaras", 178);
        Node giurgiu = new Node("Giurgiu", 77);
        Node hirsova = new Node("Hirsova", 151);
        Node iasi = new Node("Iasi", 226);
        Node lugoj = new Node("Lugoj", 244);
        Node mehadia = new Node("Mehadia", 241);
        Node neamt = new Node("Neamt", 234);
        Node oradea = new Node("Oradea", 380);
        Node pitesti = new Node("Pitesti", 98);
        Node rimnicuVilcea = new Node("Rimnicu Vilcea", 193);
        Node sibiu = new Node("Sibiu", 253);
        Node timisoara = new Node("Timisoara", 329);
        Node urziceni = new Node("Urziceni", 80);
        Node vaslui = new Node("Vaslui", 199);
        Node zerind = new Node("Zerind", 374);

        arad.addTetangga(zerind);
        arad.addTetangga(sibiu);
        arad.addTetangga(timisoara);

        bucharest.addTetangga(fagaras);
        bucharest.addTetangga(pitesti);
        bucharest.addTetangga(giurgiu);
        bucharest.addTetangga(urziceni);

        craiova.addTetangga(dobreta);
        craiova.addTetangga(rimnicuVilcea);
        craiova.addTetangga(pitesti);

        dobreta.addTetangga(mehadia);
        dobreta.addTetangga(craiova);

        eforie.addTetangga(hirsova);

        fagaras.addTetangga(sibiu);
        fagaras.addTetangga(bucharest);

        giurgiu.addTetangga(bucharest);

        hirsova.addTetangga(urziceni);
        hirsova.addTetangga(eforie);

        iasi.addTetangga(neamt);
        iasi.addTetangga(vaslui);

        lugoj.addTetangga(timisoara);
        lugoj.addTetangga(mehadia);

        mehadia.addTetangga(lugoj);
        mehadia.addTetangga(dobreta);

        neamt.addTetangga(iasi);

        oradea.addTetangga(zerind);
        oradea.addTetangga(sibiu);

        pitesti.addTetangga(rimnicuVilcea);
        pitesti.addTetangga(craiova);
        pitesti.addTetangga(bucharest);

        rimnicuVilcea.addTetangga(sibiu);
        rimnicuVilcea.addTetangga(craiova);
        rimnicuVilcea.addTetangga(pitesti);

        sibiu.addTetangga(arad);
        sibiu.addTetangga(oradea);
        sibiu.addTetangga(fagaras);
        sibiu.addTetangga(rimnicuVilcea);

        timisoara.addTetangga(arad);
        timisoara.addTetangga(lugoj);

        urziceni.addTetangga(bucharest);
        urziceni.addTetangga(vaslui);
        urziceni.addTetangga(hirsova);

        vaslui.addTetangga(iasi);
        vaslui.addTetangga(urziceni);

        zerind.addTetangga(arad);
        zerind.addTetangga(oradea);

        System.out.println("A* Search");
        AStarSearch aStar = new AStarSearch();
        aStar.search(arad, bucharest);
        System.out.println();

        System.out.println("Greedy Best-First Search");
        GreedyBestFirstSearch gbfs = new GreedyBestFirstSearch();
        gbfs.search(arad, bucharest);
    }
}
