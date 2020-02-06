class PalindromeInt {
    public boolean isPalindromeMethod1(int x) {
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
    
    public boolean isPalindromeMethod2(int x) {
        int result = 0;
        int a = x;
        if(x < 0)
            return false;
        
        while(a > 0){
            result = result * 10 + a % 10;
            a = a/10;
        }
 
       
        if(result == x)
            return true;
        else
            return false;
        
        
    }
}
