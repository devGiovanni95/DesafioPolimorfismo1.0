import java.util.Scanner;

public class Menu {

    public void imprimeMenu(){
        System.out.println("Menu de Opções:");
        System.out.println("1- Criar Conta/Cliente");
        System.out.println("2- Sacar");
        System.out.println("3- Depositar");
//        System.out.println("4- Criar Cliente");
        System.out.println("4- Tranferir valores");
        System.out.println("5- Mostrar motante disponivel nas contas");
        System.out.println("6- Sair");
        System.out.println("Escolha a opção desejada: ");
    }

    public String decisaoUsuario(){
        Scanner decisaoUsuario = new Scanner(System.in);

        String valorDecisao = decisaoUsuario.next();

        return  valorDecisao;
    }

}
