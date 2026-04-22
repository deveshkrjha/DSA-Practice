 class test
{
    static void printNto1(int n)
    {
        if(n==0)
        return;
        System.out.print(n+" ");
        printNto1(n-1);
    }
    public static void main(String[] args)
    {
        int n=4;
        printNto1(n);
    }
}

// void fun(int n)
// {
//     if(n==0)
//     return;
//     fun(n/2);
//     System.out.println(n%2);
// }