import java.util.*;

public class MenuPrincipalTeste {

    private static Object Clientes;

    public static void main(String[] args) {

        Gerente geral = new Gerente();

        Banco listacliente = new Banco();
        Menu menu = new Menu();

        System.out.println("*** Banco Mentorama ***");

//        List contas = new ArrayList<>();

        Map<Integer, Conta> clientesMentorama = new HashMap<>();
        double[] saldoBancario = new double[100];

        int id = 0;

        boolean continua = true;

        while (continua) {
            menu.imprimeMenu();
            String valorDecisao = menu.decisaoUsuario();

//            List<Conta> lista = new ArrayList<>();


            switch (valorDecisao) {
                case "1": {
                    System.out.println("Digite o numero do tipo de conta: " +
                            "\n 1- Conta Corrente" +
                            "\n 2- Conta Poupança" +
                            "\n 3- Conta Salario");

                    Scanner tipoConta = new Scanner(System.in);
                    int nomeCategoria = Integer.parseInt(tipoConta.next());

                    if (nomeCategoria == 1) {
//                        String id = "1";

//                        int id;

                        System.out.println("Digite o id do cliente: ");
                        id = tipoConta.nextInt();
                        tipoConta.nextLine();

                        System.out.println("Nome do cliente: ");
                        String clienteBanco = tipoConta.nextLine();
                        tipoConta.nextLine();
                        System.out.println("Cpf do cliente: ");
                        String cpfcliente = tipoConta.nextLine();
                        System.out.println("Numero da conta: ");
                        int numeroConta = tipoConta.nextInt();
                        System.out.println("Numero da agência: ");
                        int agenciaConta = tipoConta.nextInt();
                        tipoConta.nextLine();
                        System.out.println("Nome do banco: ");
                        String bancoConta = tipoConta.nextLine();
                        System.out.println("Saldo inicial: ");
                        double saldoConta = tipoConta.nextDouble();
                        System.out.println("Limite de cheque especial: ");
                        double chequeEspecialConta = tipoConta.nextDouble();
//                        System.out.println("Digite o ID do cliente:");
//                        id = tipoConta.nextLine();

                        ContaCorrente cc = new ContaCorrente(clienteBanco, cpfcliente, numeroConta, agenciaConta, bancoConta, saldoConta, chequeEspecialConta);

                        clientesMentorama.put(id, cc);
//                        lista.add(cc);
                        saldoBancario[id] = saldoConta;


                    } else if (nomeCategoria == 2) {

//                        int id;

                        System.out.println("Digite o id do cliente: ");
                        id = tipoConta.nextInt();
                        tipoConta.nextLine();

                        System.out.println("Nome do cliente: ");
                        String clienteBanco = tipoConta.nextLine();
                        tipoConta.nextLine();
                        System.out.println("Cpf do cliente: ");
                        String cpfcliente = tipoConta.nextLine();
                        System.out.println("Numero da conta: ");
                        int numeroConta = tipoConta.nextInt();
                        System.out.println("Numero da agência: ");
                        int agenciaConta = tipoConta.nextInt();
                        tipoConta.nextLine();
                        System.out.println("Nome do banco: ");
                        String bancoConta = tipoConta.nextLine();
                        System.out.println("Saldo inicial: ");
                        double saldoConta = tipoConta.nextDouble();
                        System.out.println("Dia aniversario ");
                        int diaAniversario = tipoConta.nextInt();

                        ContaPoupanca cp = new ContaPoupanca(clienteBanco, cpfcliente, numeroConta, agenciaConta, bancoConta, saldoConta, diaAniversario);

//                        lista.add(cp);
                        clientesMentorama.put(id, cp);
                        saldoBancario[id] = saldoConta;

                    } else if (nomeCategoria == 3) {
//                        int id;

                        System.out.println("Digite o id do cliente: ");
                        id = tipoConta.nextInt();
                        tipoConta.nextLine();

                        System.out.println("Nome do cliente: ");
                        String clienteBanco = tipoConta.nextLine();
                        System.out.println("Cpf do cliente: ");
                        String cpfcliente = tipoConta.nextLine();
                        tipoConta.nextLine();
                        System.out.println("Numero da conta: ");
                        int numeroConta = tipoConta.nextInt();
                        System.out.println("Numero da agência: ");
                        int agenciaConta = tipoConta.nextInt();
                        tipoConta.nextLine();
                        System.out.println("Nome do banco: ");
                        String bancoConta = tipoConta.nextLine();
                        System.out.println("Saldo inicial: ");
                        double saldoConta = tipoConta.nextDouble();
                        System.out.println("Quantidade saques mensais ");
                        int quantidadeSaques = tipoConta.nextInt();

                        ContaSalario cs = new ContaSalario(clienteBanco, cpfcliente, numeroConta, agenciaConta, bancoConta, saldoConta, quantidadeSaques);


//                        lista.add(cs);
                        clientesMentorama.put(id, cs);
                        saldoBancario[id] = saldoConta;

                    } else
                        System.out.println("Tipo de conta incorreta!!!!");
                    break;
                }

                //sacar
                case "2": {
                    System.out.println("Digite o tipo de conta : " +
                            "\n 1- Conta Corrente" +
                            "\n 2- Conta Poupança" +
                            "\n 3- Conta Salario");

                    Scanner tipoConta = new Scanner(System.in);
                    int nomeCategoria = Integer.parseInt(tipoConta.next());

                    if (nomeCategoria == 1) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor desejado: ");
                        int valorDesejado = tipoConta.nextInt();

                        clientesMentorama.get(idCliente);

//                        Object cliente = clientesMentorama.get(idCliente);
//                        System.out.println(cliente);

                        if (id > -1)  {

                             clientesMentorama.get(idCliente).sacar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());
                      }else {
                            System.out.println();
                        }


                    } else if (nomeCategoria == 2) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor desejado: ");
                        int valorDesejado = tipoConta.nextInt();

                        clientesMentorama.get(idCliente);

                        if (id > -1 )  {

                            clientesMentorama.get(idCliente).sacar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());

                        }

                    } else if (nomeCategoria == 3) {

                        System.out.println("Digite o id do cliente: ");
                        int idCliente = tipoConta.nextInt();
                        System.out.println("Digite o valor desejado: ");
                        int valorDesejado = tipoConta.nextInt();

                        clientesMentorama.get(idCliente);


                        if (id > -1 )  {

                            clientesMentorama.get(idCliente).sacar(valorDesejado);
                            System.out.println(clientesMentorama.get(idCliente).getSaldo());

                        }

                    } else {
                        System.out.println("Tipo de conta incorreta!!!!");

                    }

break;
                }


                //depositar
                case "3": {
                }


                //trasferir
                case "4": {
                }


                case "5": {

//                    double total = 0;
//
//                    for (Object conta : clientesMentorama.values()) {
//
////                        System.out.println( total = conta.getSaldo() + total);
//                        System.out.println(conta);
//                        return ;

//                    }
//                    System.out.println(total);

                    double montanteTotal = 0;
                    for (int i = 0; i < saldoBancario.length; i++) {
                        montanteTotal += saldoBancario[i];

                    }

                    System.out.println("Montante disponivel das contas: " + montanteTotal);
                }
//
                case "6": {
                    System.exit(0);
                }
//            default: {
//                System.out.println("Opção invalida!!");
//                break;
//            }
//            case "3": {
//                System.out.println(categoria);
//                System.out.println("Qual Categoria voce deseja remover ? ");
//                System.out.println("Digite o nome da categoria desejada ");
//  /*                  System.out.println(
//                            "Lembrando que a primeira posição equivale sempre a 0, coleque a posição em numero:");
//*/
//                Scanner remover = new Scanner(System.in);
//                String
//                        remove = remover.next();
//
//                categoria.remove(remove);
//
//            }
                default:
                    throw new IllegalStateException("Unexpected value: " + valorDecisao);
            }
        }


    }

}
