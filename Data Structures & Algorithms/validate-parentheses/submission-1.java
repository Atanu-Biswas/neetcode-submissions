class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stk= new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(isOpening(ch)){
                stk.push(ch);
            }else{
                if(stk.isEmpty()){
                    return false;
                }
                if(!isMatching(ch,stk.peek())){
                    return false;
                }
                stk.pop();
            }
        }
        if(stk.isEmpty()){
        return true;
        }

        return false;
    }

    boolean isOpening(char ch){
        return ch=='(' || ch=='{' || ch=='[';
    }

    boolean isMatching(char ch, char stkChar){
        return (stkChar=='(' && ch==')') || (stkChar=='{' && ch=='}') || (stkChar=='[' && ch==']');
    }
}
