class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        for(char ch: s.toCharArray()){
            if(isOpening(ch)){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                if(isMatching(ch,stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    boolean isOpening(char ch){
        return ch=='(' || ch=='{' || ch=='[';
    }

    boolean isMatching(char a, char b){
        return (a==')' && b=='(') || (a=='}' && b=='{') || (a==']' && b=='[');
    }
}
