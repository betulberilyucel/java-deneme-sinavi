import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dogru sayisini yaziniz");
        int d=scanner.nextInt();
          System.out.println("yanlis sayisini yaziniz");
        int y=scanner.nextInt();
        if (d>20 || d<0 || y>20 || y<0){
              System.out.println(" hatali sayi yazdiniz");
            return;
        }
        double net=d-(y/4.0);
        int bos=20-(d+y);
              System.out.println("netiniz "+ net + "  bos sayiniz " + bos );
        if(net>15){
             System.out.println("cok iyi");
        }
        else if(net<15 && net>10){
             System.out.println("fena degil");
        }
        else{
             System.out.println("cok kotu");
        }
    }
}
