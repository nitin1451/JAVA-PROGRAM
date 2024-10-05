public class binaryCoefficient 
{
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        return fact;
}  
public static int binCoef(int n, int r)
{
    int n_fact=factorial(n);
    int r_fact=factorial(r);
    int nmr_fact=factorial(n-r);

    int binCoef= n_fact/(r_fact*nmr_fact);
    return binCoef;
}
public static void main (String args[])
{
    System.out.println(binCoef(5, 4));
}}
