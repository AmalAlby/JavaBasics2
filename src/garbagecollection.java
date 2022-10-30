public class garbagecollection {
    static int count=0;
    garbagecollection(){
        count++;
    }
    public static void main(String[] args) throws InterruptedException
    {
        garbagecollection t1 = new garbagecollection();
        garbagecollection t2 = new garbagecollection();
        t1 = null;
        t2 = t1;
        Runtime.getRuntime().gc();
        System.out.println(count);
    }

    protected void finalize() throws Throwable
    {
        count--;
        System.out.println("Garbage collector called");
        System.out.printf("Object garbage collected:"+ this);
        System.out.println(count);
    }
}


