import java.util.Comparator;

public class ımplementComparator implements Comparator<huffmanNode> {
    public int compare(huffmanNode x, huffmanNode y){
        return x.item - y.item;
    }
}
