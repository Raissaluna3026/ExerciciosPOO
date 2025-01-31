
class CartaoDeCredito:
    def __init__(self, nome_titular, numero, limite, saldo, fatura, ativo, historico_transa):
        self.nome_titular = nome_titular
        self.numero = numero
        self.limite = limite
        self.saldo = saldo
        self.fatura = fatura
        self.ativo = ativo
        self.historico_transa = []
        
    def adicionar_transacao(self, transacao):
        self.historico_transa.append(transacao)
        self.fatura.adicionar_transacao(transacao)
        
    def desativar_cartao(self):
        self.ativo = False
        self.historico_transa.clear()
        self.fatura.limpar_fatura()
        
    