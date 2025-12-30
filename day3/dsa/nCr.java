public class nCr {

    public static void main(String[] args) {

        System.out.println(valnCr(3,2));
    }

    static int valnCr(int n, int r){
        if (n==r || r ==0)
            return 1;
        return valnCr(n-1,r-1) +valnCr(n-1,r);
    }


    
}
