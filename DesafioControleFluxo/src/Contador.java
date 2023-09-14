import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite primeiro numero: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite segundo numer: ");
        int parametroDois = scanner.nextInt();

        	try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		    }catch (ParametrosInvalidos e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		    }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidos {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidos();
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: "+ i);
        }
    }
}
