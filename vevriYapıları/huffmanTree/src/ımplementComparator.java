import java.util.Comparator;

public class ─▒mplementComparator implements Comparator<huffmanNode> {
    public int compare(huffmanNode x, huffmanNode y){
        return x.item - y.item;
    }
}
