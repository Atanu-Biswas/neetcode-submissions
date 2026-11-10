class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        for(String token: tokens){
            if(isOperator(token)){
                int operand2=stack.pop();
                int operand1=stack.pop();

                switch(token){
                    case"+":
                        stack.push(operand1+operand2);
                        break;
                    case"-":
                        stack.push(operand1-operand2);
                        break;
                    case"/":
                        stack.push(operand1/operand2);
                        break;
                    case"*":
                        stack.push(operand1*operand2);
                }
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    boolean isOperator(String a){
        return a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/");
    }
}
