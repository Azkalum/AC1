
package cadastrom;


public class PessoaFisica extends Pessoa {
    
    private int rg;
    private int cpf;
    private String tipo;
    
    public PessoaFisica () {
        
        
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
