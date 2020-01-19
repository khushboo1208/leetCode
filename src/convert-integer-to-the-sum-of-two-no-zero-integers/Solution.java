class Solution {
    public int[] getNoZeroIntegers(int n) {
        
        int intArray[] = new int[2];
        
        for(int i=1; ;i++) {
           
            if(divide(i) && divide(n-i)) {
                intArray[0] = i;
                intArray[1] = n-i;
                break;
            }
            
        }
        
        return intArray;
        
    }
    
    public boolean divide(int n) {
        
        while(n != 0) {
            
            if(n%10 == 0) {
                return false;
            }
            
            n = n/10;
            
        }
        
        return true;
        
    }
}