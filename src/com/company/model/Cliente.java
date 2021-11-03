package com.company.model;

import java.util.ArrayList;
import java.util.List;


public class Cliente extends Pessoa {

        public String numCarao;

        private List<Endereco> enderecos;

        public void adicionaEndereco(Endereco endereco){
                if(endereco == null){
                        throw new NullPointerException("endereço nao pode ser nulo");
                }
                if (endereco.getCep() == null){
                        throw new NullPointerException("Cep nao pode ser nulo");
                }
                getEnderecos().add(endereco);
        }

        private List<Endereco> getEnderecos() {
                if (enderecos == null){
                        enderecos = new ArrayList<Endereco>();
                }
                return enderecos;
        }


}



