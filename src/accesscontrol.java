public class accesscontrol {
    public static class A{
        private  String name="Amal";
        public String getname(){
            return this.name;
        }

    }
    public static void main(String[] args){
       A a1=new A();
       System.out.println(a1.getname());
    }
}
