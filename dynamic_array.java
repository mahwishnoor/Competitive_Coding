import java.util.*;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of sequences
        int q = sc.nextInt(); // number of queries
        List<List<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }
        int lastAnswer = 0;
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int idx = (x ^ lastAnswer) % n;
            if (type == 1) {
                seqList.get(idx).add(y);
            } else if (type == 2) {
                List<Integer> seq = seqList.get(idx);
                lastAnswer = seq.get(y % seq.size());
                results.add(lastAnswer);
                System.out.println(lastAnswer);
            }
        }
    }
}
