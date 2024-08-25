package lista5_2;

import java.util.Arrays;
import javax.swing.JOptionPane;



public class Lista5_2 {
    public static void main(String[] args) {
        final int TAM = 10;
        final int LIMITE = 50;
        int vet[] = new int [TAM];
        for(int x=0; x < TAM; x++){
            vet[x] = (int) (Math.random() * (LIMITE+1));
        }
        JOptionPane.showMessageDialog( null, "Vetor: "+Arrays.toString(vet));
    }    
}
