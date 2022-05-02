
package cadastrom;


public class PessoaJuridica extends Pessoa {
    
    private int cpnj;
    private String tipo;
    
    public PessoaJuridica () {
        
        
    }

    public int getCpnj() {
        return cpnj;
    }

    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
