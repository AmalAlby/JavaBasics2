class test{
    int x,y;

    test(int a, int b){
        x=a;
        y=b;
    }

    public int sum(int x,int y){
        return x+y;
    }

    public int sum(test m){
        int k=m.x+m.y;
        return k;
    }

    public test sum(int x){
        test t=new test(x,x);
        return t;
    }
}



public class Argumentpassing {
    public static void main(String[] args) {
        int result;
        test t1 = new test(20, 30);
        result = t1.sum(11, 22);
        System.out.println(result);
        result = t1.sum(t1);
        System.out.println(result);
        test t2=t1.sum(2);
        System.out.println(t2.x+""+t2.y);

    }
}
