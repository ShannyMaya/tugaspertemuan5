import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();
        
        hasilJumlah(N);
    }
    
    static void hasilJumlah(int N){
        int hasil = 0;
        
        for (int i = 1; i <= N; i++){
            hasil += i;
            
            System.out.print(i);
            if (i < N){
                System.out.print("+");
            }else{
                System.out.print("=" + hasil );
   
            }
        }
        
        System.out.println();
    }
    
}
