import java.util.Scanner;

public class VerificadorDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        int forca = verificarForcaSenha(senha);

        if (forca <= 2) {
            System.out.println("Sua senha e fraca!");
        } else if (forca == 3) {
            System.out.println("Sua senha e media!");
        } else if (forca == 4) {
            System.out.println("Sua senha e segura!");
        } else {
            System.out.println("Sua senha e muito forte!");
        }

        scanner.close();
    }

    public static int verificarForcaSenha(String senha) {
        int forca = 0;

        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length() >= 8) {
            forca++;
        }

        // Verifica se a senha contém pelo menos uma letra maiúscula
        if (senha.matches(".*[A-Z].*")) {
            forca++;
        }

        // Verifica se a senha contém pelo menos uma letra minúscula
        if (senha.matches(".*[a-z].*")) {
            forca++;
        }

        // Verifica se a senha contém pelo menos um dígito
        if (senha.matches(".*\\d.*")) {
            forca++;
        }

        // Verifica se a senha contém pelo menos um caractere especial
        if (senha.matches(".*[!@#$%^&*].*")) {
            forca++;
        }

        return forca;
    }
}