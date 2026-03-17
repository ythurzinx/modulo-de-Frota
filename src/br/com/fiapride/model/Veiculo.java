package br.com.fiapride.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private double combustivel;

    public Veiculo(String proprietario, String placa) {
        this.setProprietario(proprietario);
        this.setPlaca(placa);
        this.setCombustivel(0);
    }
    public String getProprietario() {
        return this.proprietario;
    }
    private void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }
    public String getPlaca() {
        return this.placa;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getCombustivel() {
        return this.combustivel;
    }

    private void setCombustivel(double combustivel) {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void adicionarCombustivel(double quantidade) {
        if (quantidade > 0) {
            this.setCombustivel(this.getCombustivel() + quantidade);
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public void consumirCombustivel(double quantidade) {
        if (quantidade > 0) {
            if (this.getCombustivel() >= quantidade) {
                this.setCombustivel(this.getCombustivel() - quantidade);
            } else {
                System.out.println("Combustível insuficiente");
            }
        } else {
            System.out.println("Quantidade inválida");
        }
    }
}