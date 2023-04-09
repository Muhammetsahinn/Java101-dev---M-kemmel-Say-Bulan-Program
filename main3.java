import java.util.Scanner;
//mükemmel sayı
public class main3 {
    public static void main(String[] args) {
        int n,sayac=1,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("N sayisini giriniz : ");
        n= input.nextInt();
        for(int i=1; i<n; i++){
            if(n%sayac==0){
                toplam+=sayac;
            }
            sayac++;
            }
        if(n==toplam){
            System.out.print(n + " Mukkemmel sayidir " );
        }else {
            System.out.print(n + " Mukkemmel sayi degildir");
        }



    }
}
