import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split("");
        Stack<String> stack = new Stack<>();
        for (int i=0; i<input.length; i++) {
            if(input[i].equals("("))
                stack.push(input[i]);
            else if(input[i].equals(")")) {
                while(!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop());
                }
                stack.pop();
            }
            else if(input[i].equals("*") || input[i].equals("/")) {
                while(!stack.isEmpty() && (stack.peek().equals("*") || stack.peek().equals("/"))) {
                    sb.append(stack.pop());
                }
                stack.push(input[i]);
            }
            else if(input[i].equals("+") || input[i].equals("-")) {
                while(!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop());
                }
                stack.push(input[i]);
            }
            else
                sb.append(input[i]);
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
