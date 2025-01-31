
import datetime
from Revisao.python import transacao
from Revisao.python.transacao import Transacao


class CartaoBasico():
    def realizar_compra(self, valor):
        if not self.ativo:
            print("Cartão desativado")
            return
        if self.saldo + valor <= self.limite:
            self.saldo += valor
            trans = Transacao(datetime.now(), valor, "compra", "credito")
            self.adicionar_transacao(transacao)
            print(f"Commpra de R${valor} realizada com sucesso")
        else:
            print("Saldo insuficiente")
            