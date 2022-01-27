import java.util.Scanner;
import java.util.Arrays;


public class sort {

    public static void main(String[] args) {

        int boyut;
        int temp;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Kaç tane sayı girişi yapacağınızı giriniz: ");
        boyut=input.nextInt();

        int[] dizi=new int[boyut];

        for (int i=0; i<boyut; i++){

            System.out.print((i+1)+". Eleman: ");
            dizi[i]=input.nextInt();

        }

        for (int x=0; x<boyut-1; x++){

            for(int y=x+1; y<boyut; y++){

                if (dizi[y]<dizi[x]){

                    temp=dizi[x];
                    dizi[x]=dizi[y];
                    dizi[y]=temp;

                }

            }

        }

        System.out.println("Sıralama: "+Arrays.toString(dizi));

    }

}
