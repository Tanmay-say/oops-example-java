package Stackoperations;


import java.util.Stack;
public class NextGreater {
    public static void main(String[] args) {
        int[] arr = {11,2,-4,5,6,8,14,15};
        int[] res = nextGreater(arr);
        for(int i = 0; i < res.length; i++) {
            System.out.println(arr[i] + "   " +res[i] + " ");
        }
    }
    public static int[] nextGreater(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = -1;
            }
            else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
    
}
