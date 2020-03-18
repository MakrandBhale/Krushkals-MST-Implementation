class Edge implements Comparable<Edge>{
    private Vertex dest;
    private int weight;
    private Vertex source;
    Edge(Vertex source, Vertex dest, int weight){
        this.source = source;
        this.dest = dest;
        this.weight = weight;
    }

    Vertex getDest(){
        return dest;
    }

    public Vertex getSource() {
        return source;
    }

    int getWeight(){
        return weight;
    }

    @Override
    public int compareTo(Edge e ){
        return this.weight - e.getWeight();
    }
}
