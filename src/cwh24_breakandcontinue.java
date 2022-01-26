public class cwh24_breakandcontinue {
    public static void main(String[] args) {
        // break and continue
//        for(int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("i am learning java");
//            if(i == 2){
//                System.out.println("ending the loop");
//                break;
//            }
//        }
//        System.out.println("loop ends here");

        for(int i = 0; i<5; i++){
            if (i==2||i==4){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java");
        }
    }
}
