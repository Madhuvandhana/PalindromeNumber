class PalindromeInt {
    public boolean isPalindrome(int x) {
        int result = 0;
        if(x < 0)
            return false;
        StringBuilder sb = new StringBuilder();
        try{
        result = Integer.parseInt(sb.append(x).reverse().toString());
            }
        catch(Exception e){
            return false;
        }
        if(result == x)
            return true;
        else
            return false;
        
    }
}
