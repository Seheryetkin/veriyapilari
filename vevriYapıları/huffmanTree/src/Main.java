import java.util.PriorityQueue;
import  java.util.Comparator;

public class Main {

    public static void main(String[] args) {
    int n = 4;
    char[] charArray = {'A','B','C','D'};
    int[] charfreq = {1, 2, 3, 4 };

    PriorityQueue<huffmanNode> q = new PriorityQueue<huffmanNode>(n, new ımplementComparator());
    for (int i=0; i<n; i++){
        huffmanNode hn = new huffmanNode();
        hn.c = charArray[i];
        hn.item = charfreq[i];

        hn.left = null;
        hn.right = null;

        q.add(hn);
    }
    huffmanNode root = null;
    while (q.size() > 1){
        huffmanNode x = q.peek();
        q.poll();

        huffmanNode y = q.peek();
        q.poll();

        huffmanNode f = new huffmanNode();

        f.item = x.item + y.item;
        f.c = '-';
        f.left = x;
        f.right = y;
        root = f;

        q.add(f);
    }
    System.out.println("karakter | huffman kodu");
    System.out.println("----------------------");
    huffman.printCode(root, "");
    }
}
