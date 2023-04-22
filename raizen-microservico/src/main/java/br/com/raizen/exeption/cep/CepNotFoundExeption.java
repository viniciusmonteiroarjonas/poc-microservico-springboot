package br.com.raizen.exeption.cep;

public class CepNotFoundExeption extends RuntimeException{

    public CepNotFoundExeption(String cep) {
        super("Cep: " + cep + " não encontrado.");
    }

}
