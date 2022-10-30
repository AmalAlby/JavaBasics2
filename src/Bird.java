abstract public class Bird {
    void fly(){
     System.out.println("can fly.....");
    }
    abstract void walk();
    abstract  void layegg();
    void eat(){
        System.out.println("can eat....");
    }
}

abstract class peacock extends Bird{
    void walk(){
        System.out.println("can walk...");
    }
    abstract void layegg();
}

class whitepeacock extends peacock{
    void layegg(){
        System.out.println("can lay egg...");
        super.eat();
    }

    public static void main(String[] args){
        whitepeacock p1=new whitepeacock();
        p1.layegg();
        p1.walk();
        p1.fly();
        Bird b1=new whitepeacock();
        b1.layegg();
    }
}
