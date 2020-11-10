
public class ContaCorrente extends Conta{
	
	ContaCorrente(int numero, int agencia){
			this.setNumero(numero); 
			this.setAgencia(agencia);
	}
	
	@Override
	public void setStatus(int status) {
		if(this.getSaldo() < 100) {
			setStatus(0);
		}else {
			setStatus(1);
		}
	}
}
