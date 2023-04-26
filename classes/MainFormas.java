package classes;

import java.util.Scanner;

public class MainFormas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[1]Círculo\n" +
                "[2]Quadrado\n" +
                "[3]Triângulo\n" +
                "[4]Retângulo\n" +
                "[5]Hexagono Regular\n" +
                "[6]Cubo\n" +
                "[7]Paralelepípedo\n" +
                "[8]Pirâmide de Base Quadrada\n" +
                "[9]Esfera\n" +
                "[10]Cilindro\n" +
                "[11]Cone\n");
        System.out.println("Digite a opção:");

        int opcao = sc.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Raio:");
                double raiocirc = sc.nextDouble();
                Circulo c1 = new Circulo(raiocirc);    //cálculo círculo
                System.out.printf("Área = %.2f %n",c1.calcularArea());
                System.out.printf("Volume = %.2f %n",c1.calcularPerimetro());

            case 2:
                System.out.println("Lado:");
                double ladoqua = sc.nextDouble();
                Quadrado q1 = new Quadrado(ladoqua);  //cálculo quadrado
                System.out.printf("Área = %.2f %n",q1.calcularArea());
                System.out.printf("Volume = %.2f %n",q1.calcularPerimetro());

            case 3:
                System.out.println("Base:");
                double basetri = sc.nextDouble();
                System.out.println("Altura:");
                double alttri = sc.nextDouble();
                System.out.println("Lado:");
                double ladotri = sc.nextDouble();
                Triangulo t1 = new Triangulo(basetri, alttri, ladotri);  //cálculo triângulo
                System.out.printf("Área = %.2f %n",t1.calcularArea());
                System.out.printf("Volume = %.2f %n",t1.calcularPerimetro());

            case 4:
                System.out.println("Base:");
                double baseret = sc.nextDouble();
                System.out.println("Altura:");
                double altret = sc.nextDouble();
                System.out.println("Lado:");
                double ladoret = sc.nextDouble();
                Retangulo r1 = new Retangulo(baseret, altret, ladoret);  //cálculo retângulo
                System.out.printf("Área = %.2f %n",r1.calcularArea());
                System.out.printf("Volume = %.2f %n",r1.calcularPerimetro());

            case 5:
                System.out.println("Apotema(a):");
                double ahex = sc.nextDouble();;
                System.out.println("Lado:");
                double ladohex = sc.nextDouble();
                HexagonoRegular h1 = new HexagonoRegular(ahex, ladohex); //cálculo hexagono
                System.out.printf("Área = %.2f %n",h1.calcularArea());
                System.out.printf("Volume = %.2f %n",h1.calcularPerimetro());

            case 6:
                System.out.println("Área:");
                double areacubo = sc.nextDouble();
                System.out.println("Bases:");
                double basecubo = sc.nextDouble();
                Cubo cb1 = new Cubo(areacubo,basecubo);
                System.out.printf("Área = %.2f %n",cb1.calcularArea());
                System.out.printf("Volume = %.2f %n",cb1.calcularVolume());

            case 7:
                System.out.println("Comprimento:");
                double comppara = sc.nextDouble();
                System.out.println("Altura:");
                double altpara = sc.nextDouble();
                System.out.println("Largura:");
                double largpara = sc.nextDouble();
                Paralelepipedo p1 = new Paralelepipedo(comppara, altpara, largpara);
                System.out.printf("Área = %.2f %n",p1.calcularArea());
                System.out.printf("Volume = %.2f %n",p1.calcularVolume());

            case 8:
                System.out.println("Largura");
                double largpi = sc.nextDouble();
                System.out.println("Altura:");
                double altpi = sc.nextDouble();
                Piramide pi1 = new Piramide(largpi, altpi);
                System.out.printf("Área = %.2f %n",pi1.calcularArea());
                System.out.printf("Volume = %.2f %n",pi1.calcularVolume());

            case 9:
                System.out.println("Raio:");
                double raioes = sc.nextDouble();
                Esfera e1 = new Esfera(raioes);
                System.out.printf("Área = %.2f %n",e1.calcularArea());
                System.out.printf("Volume = %.2f %n",e1.calcularVolume());

            case 10:
                System.out.println("Raio:");
                double raioci = sc.nextDouble();
                System.out.println("Altura:");
                double altci = sc.nextDouble();
                Cilindro ci1 = new Cilindro(raioci, altci);
                System.out.printf("Área = %.2f %n",ci1.calcularArea());
                System.out.printf("Volume = %.2f %n",ci1.calcularVolume());

            case 11:
                System.out.println("Raio:\n");
                System.out.println("Altura:\n");
                double raioco = sc.nextDouble();
                double altco = sc.nextDouble();
                Cone co1 = new Cone(raioco, altco);
                System.out.printf("Área = %.2f %n",co1.calcularArea());
                System.out.printf("Volume = %.2f %n",co1.calcularVolume());

        }

    }
}
