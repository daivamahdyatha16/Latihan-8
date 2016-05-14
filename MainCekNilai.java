package CekNilai; 
import java.util.Scanner; 
public class MainCekNilai { 
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        System.out.print("Masukkan Angka : "); 
        double x = input.nextDouble(); 
        Angka a = new Angka(); 
        if(x !=(int)x){ 
            a.methodD1(); 
        } 
        else{ 
            a.methodI1(); 
        } 
    } 
} 