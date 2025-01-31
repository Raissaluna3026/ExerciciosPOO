
class Fatura():
    def __init__(self):
        self.total = 0
        self.transacoes = []
    
    def adicionar_transacao(self, transacao):
        self.transacoes.append(transacao)
        self.total = self.total + transacao.valor
        print(f"Transacao de r${transacao.valor} adicionada com sucesso.")
        
    def limpar_fatura(self):
        self.total = 0
        self.transacoes.clear()
        print("Fatura limpa com sucesso.")