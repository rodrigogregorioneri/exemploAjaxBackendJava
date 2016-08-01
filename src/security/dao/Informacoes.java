package security.dao;


/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2016-07-18
 *
 */
 
public class Informacoes {

  public String nome;
  public String cidade;
  public String Pais;



	public Informacoes (){
	}


    public Informacoes(String nome, String cidade, String Pais) {
        this.nome = nome;
        this.cidade = cidade;
        this.Pais = Pais;
    }









    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }
  











}
