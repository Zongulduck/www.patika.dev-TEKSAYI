import java.util.Scanner;
public class TEKSAYI {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int sayı,toplam;
        toplam=0;
        do{
            System.out.println("Sayı giriniz");
            sayı= inp.nextInt();
            if(sayı%2==1){
                System.out.println("çift ve 4'ün katı olanların toplamı: "+toplam);
            }
            if(sayı%4==0){
            toplam=(toplam+sayı);
            }
        }while(sayı%2==0);


    }
}
