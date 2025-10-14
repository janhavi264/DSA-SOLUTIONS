class Solution {
    public boolean isValid(String s) {
        if(s==null) return false;
        int n= s.length();
        if(n%2!=0) return false;
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                stack.push(')');
            }else if(ch=='{'){
                stack.push('}');
            }else if(ch=='['){
                stack.push(']');
            }else{
                if(stack.isEmpty()||stack.pop()!=ch){
                    return false;
                }
            }
        } 
        return stack.isEmpty();  
    }
}
