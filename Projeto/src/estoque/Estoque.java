/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;


/**
 *
 * @author mateus
 */
public class Estoque {
    Principal e = new Principal();
    
    int  idalterar;
    int  qtdalterar;
    String nomealterar;
    double precoalterar;
    int findeditarid;

    public int getFindeditarid() {
        return findeditarid;
    }

    public void setFindeditarid(int findeditarid) {
        this.findeditarid = findeditarid;
    }

    public double getPrecoalterar() {
        return precoalterar;
    }

    public void setPrecoalterar(double precoalterar) {
        this.precoalterar = precoalterar;
    }

    public int getIdalterar() {
        return idalterar;
    }

    public void setIdalterar(int idalterar) {
        this.idalterar = idalterar;
    }

    public int getQtdalterar() {
        return qtdalterar;
    }

    public void setQtdalterar(int qtdalterar) {
        this.qtdalterar = qtdalterar;
    }

    public String getNomealterar() {
        return nomealterar;
    }

    public void setNomealterar(String nomealterar) {
        this.nomealterar = nomealterar;
    }

    public double getAlterar() {
        return alterar;
    }

    public void setAlterar(double alterar) {
        this.alterar = alterar;
    }
    double alterar;
    int idexcluir;

    public int getIdexcluir() {
        return idexcluir;
    }

    public void setIdexcluir(int idexcluir) {
        this.idexcluir = idexcluir;
    }
    public Principal getE() {
        return e;
    }

    public void setE(Principal e) {
        this.e = e;
    }

    String nome;
    int qtd,id;
    double preco;
    int findid;

    public int getFindid() {
        return findid;
    }

    public void setFindid(int findid) {
        this.findid = findid;
    }
    


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
