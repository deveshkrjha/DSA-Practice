package Practise;
//Count digits
//I/P: X=9235
//O/P: 4
public class digits {
    static int count(int x){
        int res=0;
        while(x>0)
        {
            x=x/10;
            res++;
        }
        return res;
    }
    // public static void main(String[] args){
    //     int 256;
    //     System.out.println(count(256));
    // }
}
