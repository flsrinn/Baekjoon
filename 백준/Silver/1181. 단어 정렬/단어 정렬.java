import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Vector<String> words = new Vector<>();
        for(int i=0; i<N; i++) {
            String word = scanner.next();
            if(!words.contains(word))
                words.add(word);
        }
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                return Integer.compare(o1.length(), o2.length());
            }
        });

        for (String word : words) {
            System.out.println(word);
        }

        scanner.close();
    }
}
