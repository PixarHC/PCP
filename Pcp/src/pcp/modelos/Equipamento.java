
package pcp.modelos;

/**
 *
 * @author jonathan
 */
public class Equipamento 
{
    private int idEquipamento;
    private int codDoador;
    private int quantidade;
    private String nome;
    private String descricao;

    public int getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(int idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public int getCodDoador() {
        return codDoador;
    }

    public void setCodDoador(int codDoador) {
        this.codDoador = codDoador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
