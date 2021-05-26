package exercicio3;

public class Cliente {
    private String cpf,telefone,endereco;


    public void setCpf(String cpf) {
        try {
            if(validateStringSize(cpf,11)){
                this.cpf = cpf;
            }
            else{
                throw new IllegalArgumentException("Formato invalido, favor inserir apenas números");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        try {
            if(validateStringSize(telefone,8)){
                this.telefone = telefone;
            }
            else{
                throw new IllegalArgumentException("Formato invalido, favor inserir apenas números");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    private boolean validateStringSize(String str,int size){
        if(str.length() != size){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 48 || str.charAt(i) > 57){
                return false;
            }
        }
        return true;
    }
}
