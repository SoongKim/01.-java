import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class L_Stack_Final_Final {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] result = new int[N];
        Stack<Integer> myStack = new Stack<>();

        for (int i = 0; i < N; i++) {
            while (!myStack.isEmpty() && arr[i] > arr[myStack.peek()]) {
                result[myStack.pop()] = arr[i];
            }
            myStack.push(i);
        }
        while (!myStack.isEmpty()) {
            result[myStack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(result[i]).append(' ');
        }
        System.out.println(sb);
    }
}
