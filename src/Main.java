import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Basicamente um teste pode ignorar
        listaFuncionarios();//falta coisa aqui
    }


    public static void listaFuncionarios(){
        Scanner sc = new Scanner(System.in);


        int opcao = 0;
        //int opcaoGarcom = 0;

        do {
            System.out.println("##Escolha uma opção abaixo ##");
            System.out.println("Opção 1 - Garçom");
            System.out.println("Opção 2 - Atendente");
            System.out.println("Opção 3 - Sair do programa");
            System.out.println("----------------------");

            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            if (opcao == 1){//Acessa opções do garçom

                System.out.println("Opção 1 - Limpar mesa");//chamar metodo limparMesa()
                System.out.println("Opção 2 - Comida"); // Submenu com itens
                System.out.println("Opção 3 - Bebida"); //sub menu com itens
                System.out.println("Opção 4 - Sobremesa"); //sub menu com itens
                System.out.println("Opção 5 - Pagar Conta"); // chama metodo pagarConta

                System.out.println("Digite sua opção: ");
                //opcaoGarcom = Integer.parseInt(sc.nextLine());

            } else if (opcao == 2) {// acessa opções da Atendente
                System.out.println("###############");
                System.out.println("Opção 1 - Listar mesas");
                System.out.println("opção 2 - Ocupar Mesas");

                // se opcçao 1
                //System.out.println(listaMesas.toString());
                //se opcao 2
                //System.out.print("Digite o número da mesa: ");
                //mesa.setNumero(Integer.parseInt(sc.nextLine()));

                //System.out.print("Digite a quantidade de pessoas: ");
                //mesa.setLugares(sc.nextLine());

            }
        }while (opcao !=3);

        sc.close();
    }
}