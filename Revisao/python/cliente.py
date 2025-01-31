
from Revisao.python.cartaoBasico import CartaoBasico
from Revisao.python.fatura import Fatura


class Cliente:
    def __init__(self, nome, cpf):
        self.nome = nome
        self.cpf = cpf
        self.cartoes = []
        
        
    def adicionar_cartao(self, cartao):
        self.cartoes.append(cartao)
        print(f"Cartão {cartao.numero} adicionado com sucesso.")
        
        
        
    def realizar_compra(self, numero_cartao, valor):
        cartao = None
        for c in self.cartoes_de_credito:
            if c.numero == numero_cartao:
                cartao = c
                break 
        if cartao:
            cartao.realizar_compra(valor)
        else:
            print("Cartão não encontrado.")


# Exemplo de uso
fatura1 = Fatura()
cliente = Cliente("João Silva", "123.456.789-00")
cartao1 = CartaoBasico("João Silva", "1111-2222-3333-4444", 5000, fatura1)
cliente.adicionar_cartao(cartao1)
cliente.realizar_compra("1111-2222-3333-4444", 200)
print(f"Fatura total: R${fatura1.total}")