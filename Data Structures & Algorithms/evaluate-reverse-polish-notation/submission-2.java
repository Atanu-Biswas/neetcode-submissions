class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(String token:tokens){
            if(isOperator(token)){
                int operand2 = stk.pop();
                int operand1 = stk.pop();
                switch (token){
                    case "+": stk.push(operand1 + operand2);
                        break;
                    case "*": stk.push(operand1 * operand2);
                        break;
                    case "-": stk.push(operand1 - operand2);
                        break;
                    case "/": stk.push(operand1 / operand2);
                }
            }else{
                stk.push(Integer.parseInt(token));
            }
        }

        return stk.pop();

    }

    boolean isOperator(String a){
        return a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/");
    }
}
