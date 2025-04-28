# Programação Orientada a Objetos
## Desafio da matéria: Programação Orientada a Objetos (UNASP), Módulo X.

Desenvolver uma classe contendo os dados de uma conta corrente de um banco particular.
A classe contém os seguintes atributos: código, CPF, nome do cliente e saldo.
Também contém os métodos de movimentação dessa conta, como: depósito, saque, métodos de entrada e saída dos atributos.
E implementação da classe Main que instancia as classes e testa os seus componentes.

______________________________
Diagrama de classes da classe:
          ContaCorrente         
______________________________
 - codigo: int                  
 - cpf: String                  
 - nomeCliente: String          
 - saldo: double                
______________________________
 + depositar(valor: double): void 
 + sacar(valor: double): boolean 
 + getCodigo(): int             
 + setCodigo(codigo: int): void  
 + getCpf(): String             
 + setCpf(cpf: String): void     
 + getNomeCliente(): String     
 + setNomeCliente(nome: String): void 
 + getSaldo(): double           
 + setSaldo(saldo: double): void 
________________________________


