package br.com.elostartup.api.Aluno;

public record DadosListagemAluno(String nome, String cpf, String email, Sexo sexo) {

    public DadosListagemAluno(Aluno aluno){
        this(aluno.getNome(), aluno.getCpf(), aluno.getEmail(), aluno.getSexo());
    }
}
