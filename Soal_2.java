import java.util.Scanner;

public class Method_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan batas awal = ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan batas akhir = ");
        int b = scanner.nextInt();
        
        bilanganGanjil(a, b);
    }
    
    static void bilanganGanjil(int a, int b){
        int ganjil = 0;
        
        for (int i = a; i <= b; i++){
            if (i % 2 != 0){
                ganjil++;
            }
        }
        System.out.println("Banyaknya bilangan ganjil dari " + a + " hingga " + b + " adalah: " + ganjil);
    }
}
