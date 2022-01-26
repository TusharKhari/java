class EkClass{
    int a;

    EkClass(int v){
        this.a=v;
    }
    public int returnone(){
        return 1;
    }
    public int getA(){
        return a;
    }
}
     class DoClass extends EkClass{

         DoClass(int c) {
             super(c);
             System.out.println("i am a constructor");
         }
     }
public class cwh_47_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(65);
        System.out.println(e.getA());
        DoClass d = new DoClass(1);
    }
}
