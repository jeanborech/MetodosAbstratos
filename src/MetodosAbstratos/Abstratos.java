package MetodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EntidadesAbstratos.Circulo;
import EntidadesAbstratos.Forma;
import EntidadesAbstratos.Retangulo;
import EntidadesAbstratos.enums.Cores;

public class Abstratos {

	public static void main(String[] args) {

		List<Forma> list = new ArrayList<>(); //Lista declara da superClasse
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o número de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Forma número " + i + ":");
			System.out.print("Retângulo ou circulo (r/c)? ");
			char ch = sc.next().charAt(0);
            System.out.print("Cor (PRETO/AZUL/VERMELHO)? ");
            Cores cores = Cores.valueOf(sc.next());
            
            if (ch == 'r') {
            	System.out.print("Altura: ");
                double a = sc.nextDouble();
                System.out.print("Largura: ");
                double l = sc.nextDouble();
               list.add( new Retangulo(cores, a, l));
			}
            
            else {
				System.out.print("Raio: ");
				double r = sc.nextDouble();
				list.add(new Circulo(cores, r));
			}
		}
            System.out.println();
            System.out.println("Valor Áreas: ");
            for (Forma forma : list) {
				System.out.println(String.format("%.2f", forma.area()));
		}

	}

}
