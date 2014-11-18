package Boletin95;

import javax.swing.JOptionPane;

public class Series {

    private double num = this.pedirNum();

    public double pedirNum() {
        do {
            String dato = JOptionPane.showInputDialog("Introducir números");
            num = Double.parseDouble(dato);
        } while (num <= 0);
        return num;
    }

    public String Serie1() {
        long num0 = 0;
        String serie1 = "";
        for (int i = 0; i < num; i++) {
            num0 = num0 + 2;
            serie1 += " " + num0;
        }
        return serie1;
    }

    public String Serie2() {
        String serie2 = "";
        for (int i = 1; i < num + 1; i++) {
            if (i % 2 == 0) {
                serie2 = serie2 + "+" + i;
            }
            if (i % 2 == 1) {
                serie2 += "-" + i;
            }
        }
        return serie2;
    }

    public String Serie3() {
        long a = 0;
        long b = 1;
        long c = 0;
        String serie3 =a+","+b;
        for (int i = 2; i  < num; i++) {
            c=a+b;
            a= b;
            b = c;
            serie3 += ","+ c;
        }
        return serie3;
    }
    
    //c= a+b  a=b b=c

    public void calcularSeries() {
        String serie = ("Serie 1: " + this.Serie1() + "\nSerie 2: " + this.Serie2() + "\nSerie 3: " + this.Serie3());
        JOptionPane.showMessageDialog(null, serie);
    }
}
