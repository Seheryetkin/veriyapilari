import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i , j,tmp = 0;
        int d[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayilari giriniz :");

        for (i = 0; i < d.length; i++) {
            d[i] = sc.nextInt();
        }
        for(j=0 ; j<d.length ; j++ ){
            if(d[j]<d[3*j+1] && d[j]<d[3*j+2] && d[j]<d[3*j+3]){
                System.out.println("Evet. Min Heap'tir.");
            }
            else{
                for(int k=1 ; k<d.length ; k++){
                    if(d[k]<d[k-1/3]){
                        tmp = d[k];
                        d[k]= d[k-1/3];
                        d[k-1/3]= tmp;
                    }
                }
                for (int sayilar: d) {
                    System.out.println(sayilar);
                }
            }
        }

    }
}
