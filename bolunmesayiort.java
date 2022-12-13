import java.util.Scanner;
public class bolunmesayiort {
    public static void main(String[] args) {
        double sayi,ortalama,toplam=0,n=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        sayi=inp.nextInt();

        for (int i=1; i<=sayi; i++){
            if (i%3==0 && i%4==0){
                System.out.println(i);
                toplam=toplam+i;
                n++;
            }
        }
        ortalama=toplam/n;
        if (toplam!=0){
            System.out.println("3 ve 4'e bölünebilen sayıların ortalaması:"+ortalama);
        }
        else {
            System.out.println("3 ve 4'e bölünebilen sayı bulunmamaktadır");

        }



    }
}
