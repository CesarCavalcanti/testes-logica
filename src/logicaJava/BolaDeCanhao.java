package logicaJava;


import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BolaDeCanhao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float g = 9.80665f;
        float pi = 3.14159f;

        float altura = sc.nextFloat();
        sc.nextLine();
        String[] cordenadas = sc.nextLine().split(" ");
        int tentativas = sc.nextInt();
        sc.nextLine();
        String dados[] = sc.nextLine().split(" ");
        int indice = 0;
        String test = dados[0];
        String test2 = dados[1];
        while (sc.hasNext()) {
            Double valor1 = Double.parseDouble(test);
            Double valor2 = Double.parseDouble(test2);
            float a = (float) ((g / 2) * (-1));
            float b = (float) ((Math.sin(valor1 * pi / 180)) * valor2);
            float c = altura;
            float delta = (b * b) - (4 * a * c);
            float tempo1 = (float) (((-1 * b) + Math.sqrt(delta)) * (2 * a));
            float tempo2 = (float) (((-1 * b) - Math.sqrt(delta)) / (2 * a));
            float tempo;
            if (tempo1 > tempo2) {
                tempo = tempo1;
            } else {
                tempo = tempo2;
            }
            float vx = (float) ((Math.cos(valor1 * pi / 180)) * valor2);
            float alcance = vx * tempo;
            BigDecimal bd = new BigDecimal(alcance).setScale(5, RoundingMode.HALF_EVEN);
            String saida = Double.toString(bd.doubleValue());

            if ((alcance >= Integer.parseInt(cordenadas[0])) && (alcance <= Integer.parseInt(cordenadas[1]))) {
                System.out.println(saida + " -> DUCK");
            } else {
                System.out.println(saida + " -> NUCK");
            }
            indice += 2;
            sc.nextLine();
            try {
                dados = sc.nextLine().split(" ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }}






