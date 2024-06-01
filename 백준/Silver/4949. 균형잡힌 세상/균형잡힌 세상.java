import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String string = br.readLine();
            String[] words = string.split("");
            if(string.equals(".")) {
                break;
            }

            Stack<String> stack = new Stack();
            boolean wrong = false;
            for (int i=0; i<words.length; i++) {
                if(words[i].equals("(") || words[i].equals("[")) {
                    stack.push(words[i]);
                }
                else if(words[i].equals(")")) {
                    if(!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    }
                    else {
                        wrong = true;
                    }
                }
                else if(words[i].equals("]")) {
                    if(!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    }
                    else {
                        wrong = true;
                    }
                }
            }

            if(stack.empty() && !wrong) {
                sb.append("yes\n");
            }
            else {
                sb.append("no\n");
            }
        }
        bw.write(String.valueOf(sb));

        bw.flush();
        bw.close();
        br.close();
    }
}
