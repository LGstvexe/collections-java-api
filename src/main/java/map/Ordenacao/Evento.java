package main.java.map.Ordenacao;

public class Evento {

    //Atributos
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeEvento, String nomeAtracao) {
        this.nomeEvento = nomeEvento;
        this.nomeAtracao = nomeAtracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }

    @Override
    public String toString() {
        return "Nome do Evento: " + nomeEvento +
                ", Nome da Atração: " + nomeAtracao;
    }
}
