class fact{
    int facto(int n){
        int result;
        if(n==1){return 1;}
        result=facto(n-1)*n;
        return result;
    }

}

public class Factorial {
    public static void main(String[] args){
        fact f1=new fact();
        System.out.println("factorial of 5 is : "+f1.facto(5));
    }
}
