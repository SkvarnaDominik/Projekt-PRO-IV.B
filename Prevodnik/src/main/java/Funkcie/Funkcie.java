package Funkcie;
import java.util.Scanner;

public class Funkcie{
   
     
    static void funkcie(){
        int vyber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vyber si prevod. ");
        System.out.println("Z 2-kovej do 10-kovej = 1 \n"
                         + "Z 10-kovej do 2-kovej = 2 \n"
                         + "Z 2-kovej do 16-kovej = 3 \n"
                         + "Z 16-kovej do 2-kovej = 4 \n"
                         + "Z 10-kovej do 16-kovej = 5 \n"
                         + "Z 16-kovej do 10-kovej = 6");
        System.out.println("");
        System.out.println("Tvoj výber: ");
        vyber = scanner.nextInt();
        
        if(vyber > 6)
        {
         System.out.println("");
         System.out.println("Zadal si zlý výber.");
         System.out.println("");
        }
        
        if(vyber == 1)
        {
         System.out.println("");
         System.out.println("Zadaj číslo z 2-kovej sústavy:");
         int no = scanner.nextInt(2);
         System.out.println("Číslo v 10-kovej sústave:");
         System.out.println(no);
         System.out.println("");
        }

        
        if(vyber == 2)
        {
         int cislo;
         int i = 0;
         int binary[] = new int[100];
         System.out.println("");
         System.out.println("Zadaj číslo v 10-kovej sústave: ");
         cislo = scanner.nextInt();
         while(cislo != 0){
                           binary[i] = cislo%2;
                           cislo = cislo/2;
                           i++;
                          }
         System.out.println("Číslo v 2-kovej sústave: " );
         for(int j=i; j>=0; j--){
         System.out.print(binary[j]);
        }
         System.out.println("\n");
        }
        
        if(vyber == 3)
        {
         int[] hex_num = new int[100];
         int k=1, m=0, cr, dec_num=0;
         System.out.println("");
         System.out.println("Zadaj číslo v 2-kovej sústave: ");
         int bin_num = scanner.nextInt();
         while(bin_num>0){
                          cr=bin_num % 2;
                          dec_num = dec_num + cr * k;
                          k = k * 2;
                          bin_num = bin_num / 10;
                         }
         k=0;
         while(dec_num != 0){
                             hex_num[k] = dec_num % 16;
                             dec_num = dec_num / 16;
                             k++;
                            }
         System.out.println("Číslo v 16-kovej sústave:");
         for(m=k-1; m>=0;m--){
                              if(hex_num[m]>9){
                                               System.out.print((char)(hex_num[m]+55));
                                              }
         else{
              System.out.print(hex_num[m]);
             }
                             }
         System.out.println("\n");
        }
        
        if(vyber == 4)
        {
         String hex_num;
         System.out.println("");
         System.out.println("Zadaj číslo v 16-kovej sústave: ");
         hex_num = scanner.next();
        
         int decimal;
         String binary;
        
         decimal = Integer.parseInt(hex_num, 16);
         binary = Integer.toBinaryString(decimal);
        
        
         System.out.println("Číslo v 2-kovej sústave: " + binary);
         System.out.println("");
        }
        
        if(vyber == 5)
        {
         int dec_num;
         int reminder;
         char[] hex_num={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F',};
         String hexaValue="";
         System.out.println("");
         System.out.println("Zadaj číslo z 10-kovej sústavy: ");
         dec_num = scanner.nextInt();
         while(dec_num>0){
                          reminder = dec_num % 16;
                          hexaValue = hex_num[reminder] + hexaValue;
                          dec_num = dec_num / 16;
                         }
         System.out.println("Číslo v 16-kovej sústave:" + hexaValue);
         System.out.println("\n");
        }
        
        if(vyber == 6)
        {
         int dec_num;
         System.out.println("");
         System.out.println("Zadaj číslo v 16-kove sústave: ");
         dec_num = scanner.nextInt(16);
         System.out.println("Číslo v 10-kovej sústave:" + dec_num);
         System.out.println(dec_num);
         System.out.println("");
        }
        funkcie();
    }
    public static void main(String[] args){
       funkcie();
    }
   }