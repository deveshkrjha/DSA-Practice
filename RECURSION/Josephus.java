public class Josephus {
    static int jos(int n,int k)
    {
        if(n==1)
        return 0;
        else
        return(jos(n-1,k)+k)%n;
    }
    public static void main(String[] args)
    {
        int person=7;
        int round=3;
        System.out.println(jos(person,round));
    }
}