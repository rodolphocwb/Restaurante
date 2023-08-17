# Restaurante

atendente:
"cadastra"/ ocupa mesa com novo cliente
faz reserva de mesa

garçom:
libera mesa
bloqueia mesa
pede limpeza de mesa
fecha conta


1 - cadastrar pedido (mostra a lista dos itens etc),
        // 2 - processar fila,
        // 3- cancelar um pedido da fila

cadastrar item como metodo

Classe menu ou cardapio

classe principal funcionarios
garçom e atendente erdam de funcioanrios



menu inicial
1 - recepcionista
2 - garçom
3 - Cliente

==========================================
Menu recepcionista

2- ocupar mesa

menu ocupar mesa so mostrar disponiveis

Escolha a mesa para ocupar ou bloquear
mesa 1 - 4  lugares
mesa 2 - 3 lugares
mesa 3 - 2 lugares
mesa 4 - 4 lugares

digitar 4

mesa 4 ocupada com sucesso




seja bem vindo

Mesa para quanto?
input resposta:4 -> verifica em lista de mesa se tem opção 4 lugares e se esta vaga
Se houver mesa disponivel, confirmar reserva!
*Se não houver mesa disonivel --> texto de espera

===============================================
Menu garçom

0-limpar mesa (limpar mesa torna ela ocupavel(desocupar mesa))
1-Comida
2-bebida
3-sobremesa
4-pagar conta

=====================
Sub menu do garçom
1.1 tipos de comida e valor
2.1 tipos de bebida e valor
3.1 tipos de sobremesa e valor

====================
Sub menu de pagar conta

4.1 pagar conta individual (Dividir o valor pelo numero de luagres/pessoa)
4.2 pagar conta conjunta ( 1pessoa paga toda a conta)
4.3 escolher forma de pagamento - credito ou debito ou dinheiro

--> Valida no saldo do cliente se ele possui dinheiro para realizar o pagamento
	--> Consulta saldo da forma de pagamento escolhida
		--> Caso tenha saldo -> Ativa texto de despedidaCliente
		--> Caso não tenha saldo -> Dá a opção de dividir a conta com a mesa ou lavar pratos








