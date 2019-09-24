package funcionariosList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Employe;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		List<Employe> lista = new ArrayList<>();
		Employe func = new Employe();

		System.out.println("digite a quantidade de funcionarios para cadastrar: ");
		int n = in.nextInt();
		in.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.println("digite o Id, Nome e Salário do funcionário: ");
			int id = in.nextInt();
			in.nextLine();
			String nome = in.nextLine();
			double salario = in.nextDouble();
			func = new Employe(id, nome, salario);
			lista.add(func);

		}
		System.out.println("informe o Id para aumento de salário: ");
		int id = in.nextInt();
		Employe emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("id invalido!!!!!");
		} else {
			System.out.println("digite o percentual de aumento: ");
			double percentual = in.nextDouble();
			emp.aumentoSalaraio(percentual);
		}

		System.out.println("lista de funcionarios:");

		for (Employe obj : lista) {
			System.out.println(obj);

		}

	}

}
