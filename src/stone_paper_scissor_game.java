import java.util.Scanner;

public class stone_paper_scissor_game {
    public static void main(String[] args) {
        System.out.println("player 1 choose and enter the no. \n 1. stone \n 2. paper \n 3.scissor\nenter your choice ");

        Scanner stone  = new Scanner(System.in);
        int a = stone.nextInt();

        if(a==1){
            System.out.println(
                    "player 2 choose and enter the no. \n 1. paper \n 2.scissor  \nenter your choice "
            );
            Scanner paperscissor = new Scanner(System.in);
            int b = paperscissor.nextInt();
            if (b==1){
                System.out.println("player 2 is winner");

            } if (b>2){
                System.out.println("andha h kya be ");

            } else System.out.println("player 1 is winner");
        }else if(a == 2){
            System.out.println("player 2 choose and enter the no. \n 1. stone \n 2.scissor  \nenter your choice ");
            Scanner stonescissor = new Scanner(System.in);
            int c = stonescissor.nextInt();
            if(c==1){
                System.out.println("player 1 is winner");
            } if (c>2){
                System.out.println("andha h kya be ");

            }
            else{
                System.out.println("player 2 is winner");
            }
        }else if(a==3){
            System.out.println("player 2 choose and enter the no. \n 1. stone \n 2.scissor  \nenter your choice ");
            Scanner stonescissor = new Scanner(System.in);
            int d = stonescissor.nextInt();
            if(d==1){
                System.out.println("player 1 is winner");
            }if (d>2){
                System.out.println("andha h kya be ");

            }
            else{
                System.out.println("player 2 is winner");
            }
        }
        if(a>3 ){
            System.out.println("andha h kya be ");
        }

    }
}

//    Scanner sc = new Scanner(System.in);
//    String name = sc.nextLine();