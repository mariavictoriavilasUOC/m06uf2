package exam;

/**
 *
 * @author julian
 */
public class Banda {
    
    private Integer id;
    private String nom;
    
    public Banda(String nom) {
        this(null, nom);
    }
    
    public Banda(Integer id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Banda{" + "id=" + id + ", nom=" + nom + '}';
    }
}
