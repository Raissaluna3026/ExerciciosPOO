
from datetime import datetime

class Transacao:
    def __init__(self, data, valor, descricao, tipo):
        self.data = data
        self.valor = valor
        self.descricao = descricao
        self.tipo = tipo
    def detalhes_da_transacao(self):
        print(f"Data: {self.data}, valor: R${self.valor}, descrição: {self.descricao}, tipo: {self.tipo}") 
        
