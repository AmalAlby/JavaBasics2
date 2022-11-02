interface interface_22 {
    public void method1();
}

interface int2 extends interface_22{
    public void method2();
}

public class interface_2 implements int2{
    public void method1(){
        System.out.println("HAI");
        }
    public void method2(){
        System.out.println("HAI.....");
        }
        public static void main(String[] args){
            interface_2 i1=new interface_2();
            i1.method1();
            i1.method2();
        }

}

