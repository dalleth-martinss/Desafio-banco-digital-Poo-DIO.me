public interface InterConta {
   
   
   void sacar(double valor);
	
	void depositar(double valor);
	
	void transferir(double valor, InterConta contaDestino);
	
	void imprimirExtrato();
}
