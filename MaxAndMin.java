
public class MaxAndMin
{
    public static int minArrayIndex(int[] min){
        int minimum=Integer.MAX_VALUE;
        for(int i:min){
            if(i<minimum){
                minimum=i;
            }
        }
        for(int i=minimum; i<min.length; i++){
            if(i==minimum){    
            return min[i];
        }
    }
        return +1;
    }
}
 