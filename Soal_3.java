import java.util.Scanner;

public class Method_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n : ");
        int n = scanner.nextInt();
        
        hasilFaktorial(n);
    }
    static void hasilFaktorial(int n){
        if(n < 0){
            System.out.println("n lebih besar atau sama dengan nol");
            return;
        }
        long faktorial = 1;
        
        for(int i = n; i > 0; i--){
            faktorial *= i;
            
            System.out.print(i);
            if ( i >1){
                System.out.print("*");
            }else{
                System.out.print(" = " + faktorial);
            }
        }
        System.out.println();
    }
}
