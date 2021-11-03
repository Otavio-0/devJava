package Poo;

import com.company.model.Cliente;
import com.company.model.Endereco;

public class EntregaCartaoApp {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();

        endereco.setCep("0000");
        // dados do endereço

        Cliente cliente = new Cliente();

        //dados do cliente


        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço adicionado com sucesso");
        }catch (Exception e){
            System.err.println("Houve um erro ao adicinar o endereço" + e.getMessage());
        }

    }
}
