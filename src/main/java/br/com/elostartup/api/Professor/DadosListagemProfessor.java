package br.com.elostartup.api.Professor;

public record DadosListagemProfessor(String cfep, String nome, String email, Sexo sexo) {

    public DadosListagemProfessor(Professor professor){
        this(professor.getCfep(), professor.getNome(), professor.getEmail(), professor.getSexo());
    }
}
