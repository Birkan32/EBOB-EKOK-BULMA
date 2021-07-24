import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int n1 ,n2 ;
        System.out.print("n1 Sayısını Giriniz :");
        n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz :");
        n2 = input.nextInt();

        while(n1 != n2)
        {
            if(n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
            break;
        }

        System.out.println("EBOB = " + n1);

      /*  int ekok =1 ;
        ekok= (n1 > n2) ? n1 : n2;

        while(n1 != n2)
        {
            if( ekok % n1 == 0 && ekok % n2 == 0 )
            {
                System.out.printf("%d ve %d sayılarının EKOK'u %d dir.", n1, n2, ekok);
                break;
            }
            ++ekok;
        } */

    }
}
