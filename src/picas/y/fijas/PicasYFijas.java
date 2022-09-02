package picas.y.fijas;

import javax.swing.JOptionPane;

public class PicasYFijas {

    public static void main(String[] args) {
        pica();
    }

    public static void pica() {
        int picas = 0;
        int fijas = 0;
        String mostrar = "";
        String mostrar1 = "";
        int[] num = new int[4];
        int[] a = {1, 2, 3, 4};
        JOptionPane.showMessageDialog(null, "Adivine el numero de 4 digitos");
        for (int i = 0; i < 4; i++) {
            num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite en posicion " + (i + 1)));
        }
        for (int i = 0; i < 4; i++) {
            mostrar = mostrar + num[i];
        }
        for (int i = 0; i < 4; i++) {
            mostrar1 = mostrar1 + a[i];

        }
        for (int i = 0; i < a.length; i++) {
            if (num[i] == a[i]) {
                fijas++;
            }

        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (num[i] == a[j]) {
                    picas++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "El numero era: " + mostrar1);
        JOptionPane.showMessageDialog(null, "El numero tuyo: " + mostrar);
        JOptionPane.showMessageDialog(null, "Tienes: " + fijas + " Fijas");
        JOptionPane.showMessageDialog(null, "Tienes: " + picas + " Picas");

    }
}
