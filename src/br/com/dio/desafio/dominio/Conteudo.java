package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    //Todo Bootcamp tem conteudo e mentorias e cursos são conteudos
    protected static final double XP_PADRAO = 10.0; //constante pela palavra reservada Final
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
