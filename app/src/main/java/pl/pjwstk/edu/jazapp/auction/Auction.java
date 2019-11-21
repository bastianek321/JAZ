package pl.pjwstk.edu.jazapp.auction;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "auction")
public class Auction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private float price;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private Category category;

    @OneToMany
    @JoinColumn(name = "auctionId")
    private List<Photos> photos;

    public Auction(){}
    public Auction(String title, String description, float price, Category category, List<Photos> photos){
        this.title = title;
        this.description = description;
        this.price = price;
        this.category = category;
        this.photos = photos;
    }
}
