class Factorial{
    int fact(int n){
        if(n==0)
        return 1;
        return n*fact(n-1);
    }
    public static void main(String[]args){
        Factorial ob=new Factorial();
        int res=ob.fact(10);
        System.out.println(res);
    }
}