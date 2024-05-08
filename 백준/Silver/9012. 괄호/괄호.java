import java.io.*;

class VPSStack {
    int top = -1;
    String[] stack = new String [50];

    void initStack() {
        for (int i=0; i<50; i++) {
            stack[i] = "";
        }
    }

    boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    void push(String parenthesis) {
        stack[++top] = parenthesis;
    }

    String pop() {
        if(top == -1) {
            return "";
        }
        return stack[top--];
    }
}

public class Main {
    private static boolean check(String[] VPS) {
        VPSStack vpsStack = new VPSStack();
        vpsStack.initStack();
        if(VPS.length % 2 == 1) return false;
        for (int i=0; i<VPS.length; i++) {
            switch (VPS[i]) {
                case "(":
                    vpsStack.push(VPS[i]);
                    break;
                case ")":
                    if(!vpsStack.isEmpty()) {
                        vpsStack.pop();
                    }
                    else return false;
                    break;
            }
        }
        return vpsStack.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String [] VPSs = new String[T];

        for (int i=0; i<T; i++) {
            VPSs[i] = br.readLine();
            String[] VPS = VPSs[i].split("");
            if(!check(VPS)) {
                bw.write("NO\n");
            }
            else  {
                bw.write("YES\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
