package exercicio3;

public class CadastroCliente {
    private Cliente[] cadastros = new Cliente[10];
    private int aux = 0;

    public void inserir(Cliente c){
        try {
            if(validateCPF(c)){                
                this.cadastros[aux] = c;
            }
            else if(vacancy() == 0){
                throw new Exception("Nao foi possivel cadastrar pois está cheio");
            }
            else{
                throw new Exception("CPF ja cadastrado");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Cliente buscaCliente(String cpf) {
        try {
            for (Cliente cliente : cadastros) {
                if(cliente.getCpf()==cpf){
                    return cliente;
                }
            }
            throw new Exception("Cliente ainda nao cadastrado");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        
    }

    private boolean validateCPF(Cliente c) {
        for (Cliente cliente : cadastros) {
            if(c.getCpf() == cliente.getCpf()){
                return false;
            }
        }
        return true;
    }

    private int vacancy() {
        int vacancy = 0;
        for (Cliente cliente : cadastros) {
            if(cliente != null){
                vacancy++;
            }
        }
        return vacancy;
    }
}
