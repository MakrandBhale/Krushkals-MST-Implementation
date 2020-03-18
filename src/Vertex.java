import java.util.ArrayList;

class Vertex {
    private String name;
    private ArrayList<Edge> edges = new ArrayList<>();
    private Vertex parent;
    private Edge source;
    Vertex(String name){
        this.parent = this;
        this.name = name;
    }

    Vertex getParent() {
        return parent;
    }

    void setParent(Vertex parent){this.parent = parent;}

    String getName(){
        return name;
    }

    Edge addEdge(Vertex v, int weight){
        Edge edge = new Edge(this, v, weight);
        this.edges.add(edge);
        return edge;
    }

    ArrayList<Edge> getEdges(){
        return edges;
    }


}
