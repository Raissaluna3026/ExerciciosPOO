import datetime
from Revisao.python import transacao
from Revisao.python.cartaoDeCredito import CartaoDeCredito
from Revisao.python.transacao import Transacao



class CartaoPremium(CartaoDeCredito):
    def __init__(self, nome_titular, numero, limite, fatura, cashback):
        super().__init__(nome_titular, numero, limite, fatura)
        self.cashback = cashback
        self.pontos_fidelidade = 0
        
    def realizar_compra(self, valor):
        if not self.ativo:
            print('Cartão inativo')
            return
        if self.saldo + valor <= self.limite:
            self.saldo += valor
            self.pontos_fidelidade += int(valor)
            trans = Transacao(datetime.now(), valor, "Compra com pontos fidelidade", "compra")
            self.adicionar_transacao(transacao)
            print(f"Compra de R${valor} realizada no Cartão Premium. Pontos acumulados: {self.pontos_fidelidade}")
        else:
            print("Compra não autorizada. Limite insuficiente.")
    
    def aplicar_cashback(self):
        if self.pontos_fidelidade >= 1000:
            valor_cashback = self.pontos_fidelidade * self.cashback
            self.pontos_fidelidade = 0
            trans = Transacao(datetime.now(), -valor_cashback, "Cashback aplicado", "Cashback")
            self.adicionar_transacao(transacao)
            print(f"Cashback de R${valor_cashback} aplicado com sucesso.")
        else:
            print("Pontos insuficientes para aplicar cashback.")