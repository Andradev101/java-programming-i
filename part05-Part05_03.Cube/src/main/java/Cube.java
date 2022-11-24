public class Cube {
    private int edgelength;

    public Cube(int edgelength) {
        this.edgelength = edgelength;
    }

    public int volume(){
        Integer vol = (int) Math.pow(this.edgelength, 3);
        return vol;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + this.edgelength + " and the volume " + volume();
    }
}
