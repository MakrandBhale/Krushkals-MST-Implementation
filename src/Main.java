public class Main {

    public static void main(String[] args) {
	// write your code here
        Graph g = new Graph();
        Vertex a = g.createVertex("a");
        Vertex b = g.createVertex("b");
        Vertex c = g.createVertex("c");
        Vertex d = g.createVertex("d");

        Vertex e = g.createVertex("e");

        g.addEdge(a,b,15,true);
        g.addEdge(a,c,3,true);
        g.addEdge(a,d,2,true);
        g.addEdge(d,c,2,true);
        g.addEdge(b,c,1,true);
        g.addEdge(c,e,4,true);
        g.addEdge(b,e,190,true);
        g.addEdge(e,d,180,true);
        g.start();
        g.printMST();
    }
}
