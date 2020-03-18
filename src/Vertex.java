import java.util.ArrayList;

public class Vertex {
    private String name;
    private ArrayList<Edge> edges = new ArrayList<>();

    Vertex(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void addEdge(Vertex v, int weight){
        this.edges.add(new Edge(v, weight));
    }

    public ArrayList<Edge> getEdges(){
        return edges;
    }

}
