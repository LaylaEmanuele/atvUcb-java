
public class ContaEmpresarial extends Conta{
	ContaEmpresarial(int numero, int agencia){
		this.setNumero(numero); 
		this.setAgencia(agencia);
	}
	
	@Override
	public void setStatus(int status) {
		if(this.getSaldo() < 500) {
			setStatus(0);
		}else {
			setStatus(1);
		}
	}
}
