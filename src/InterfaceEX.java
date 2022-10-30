//Example of interface class

interface InterfaceEX {
    void walk1();
    void eat1();
    void layegg1();

    /* void demo(){
    //     System.out.println("hiiiii....");
     }*/
    // we cannot do these because in an interface class we cannot add a body to a method
    //because in an interface method all the methods are abstract methods
}

abstract class peacock1 implements InterfaceEX{
    public void walk1(){
        System.out.println("can walk...");
    }
    public void eat1(){
        System.out.println("can eat....");
    }
    public abstract void layegg1();
}

class whitepeacock1 extends peacock1{
     public void layegg1(){
        System.out.println("can lay egg...");
    }

    public static void main(String[] args){
        whitepeacock1 w1=new whitepeacock1();
        w1.walk1();
        w1.walk1();
        w1.layegg1();
    }
}