
package maxsumfunction;

public class MaxSumFunction {
    
    static private int seqStart = 0;
    static private int seqEnd = -1;
    
    public static int maxSubSum( int [ ] a )
    {
        int maxSum = 0;
        int thisSum = 0;

        for( int i = 0, j = 0; j < a.length; j++ )
        {
            thisSum += a[ j ];

            if( thisSum > maxSum )
            {
                maxSum = thisSum;
                seqStart = i;
                seqEnd   = j;
                System.out.println(a[i]+ " "+a[j] );
            }
            else if( thisSum < 0 )
            {
                i = j + 1;
                thisSum = 0;
            }
        }
        return maxSum;
    }
 
    public static void main(String[] args) {

        int dizi[ ] = { 4, -3, 5, -2, -1, 2, 6, -2 };
        int maxSum;
        maxSum = maxSubSum( dizi );
        System.out.println( "Max sum is " + maxSum + "; it goes"
                       + " from " + seqStart + " to " + seqEnd ); 
        
    }
    
}
