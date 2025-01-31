
import datetime
from Revisao.python import transacao
from Revisao.python.cartaoDeCredito import CartaoDeCredito
from Revisao.python.transacao import Transacao


class CartaoEmpresarial(CartaoDeCredito):
    def __init__(self, nome_titular, numero, limite, fatura, limite_extra):
        super().__init__(nome_titular, numero, limite, fatura)
        self.limite_extra = limite_extra
    
    def realizar_compra(self, valor):
        if not self.ativo:
            print("Cartão inativo")
            return
        saldo_disponivel = self.limite + self.limite_extra
        if self.saldo + valor <= saldo_disponivel:
            self.saldo += valor
            trans = Transacao(datetime.now(), valor, "compra", "debito")
            self.adicionar_transacao(transacao)
            print("Compra de R${valor} realizada com sucesso")
        else:
            print("Saldo insuficiente")
            
    def realizar_compra_parcelada(self, valor, parcelas):
        if not self.ativo:
            print("Cartão inativo")
            return
        valor_parcela = valor / parcelas
        saldo_disponivel = self.limite + self.limite_extra
        if self.saldo + valor <= saldo_disponivel:
            self.saldo += valor
            for i in range(1, parcelas + 1):
                trans = Transacao(datetime.now(), valor_parcela, f"Parcela {i}/{parcelas}", "compra parcelada")
            print(f"Compra de R${valor} realizada em {parcelas} parcelas de R${valor_parcela} cada")
        else:
            print("Limite insuficiente")
            