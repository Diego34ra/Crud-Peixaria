package peixes.peixariaprojeto.Model;

import javax.persistence.*;

@Entity
@Table(name = "peixe")
public class Peixe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "peixe_id")
    private Integer id;
    @Column(length = 50, nullable = false)
    private String name;
    @Column(length = 30, nullable = false)
    private String raça;
    @Column(length = 5, nullable = false)
    private Integer quantidade;
    @Column(length = 5,nullable = false)
    private float preço;


    public float getPreço() {
        return preço;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Peixe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", raça='" + raça + '\'' +
                ", quantidade=" + quantidade +
                ", preço=" + preço +
                '}';
    }
}