package day12.dsa;

import java.util.ArrayDeque;

public class parenthesesMatching {
    public static void main(String[] args) {

        String s = "[(){}]";
        System.out.println(validParentheses(s));

    }

    static boolean validParentheses(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(curr);
            }else {
                if (stack.isEmpty()) return false;
                char opening = stack.pop();

                if (opening == '(' && curr ==')' || opening =='{' && curr == '}' || opening =='[' && curr == ']'){
                    continue;
                }else return false;
            }
        }
        return stack.isEmpty();
    }
}
