package com.company.model;

public class Pessoa {

    private static final  int TAMANHO_CPF = 11;
    private static final int TAMANHO_CNPJ = 14;

    public enum TipoPessoa {FISICA, JURIDICA}
    private String nome;
    private String documento;
    private String codigo;

    public TipoPessoa tipo;

    public String getDocumento(){
        return  documento;
    }

    public void setDocumento(String documento) {
        if(documento == null || documento.isEmpty()){
            throw new RuntimeException("Documento nao pode ser nullo ou vazio");
        }
        if (documento.length() == TAMANHO_CPF){
            setDocumento(documento, tipo = TipoPessoa.FISICA );
        } else  if (documento.length() == TAMANHO_CNPJ){
            setDocumento(documento, tipo = TipoPessoa.JURIDICA );
        } else {
            throw  new RuntimeException("DOCUMENTO INVALIDO PAR PESSOA FISICA PU JURIDICA");
        }

    }

    private void setDocumento(String documento, TipoPessoa tipo){
        this.documento = documento;
        this.tipo = tipo;

    }

    public TipoPessoa getTipo(){
        return  tipo;
    }


}
