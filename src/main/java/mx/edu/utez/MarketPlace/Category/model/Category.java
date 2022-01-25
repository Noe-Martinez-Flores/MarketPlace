package mx.edu.utez.MarketPlace.Category.model;

import javax.persistence.*;

@Entity
public class Category {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(columnDefinition =  "text", unique = true)
    private  String description;

    public Category(String description) {
        this.description = description;
    }

    public Category() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
