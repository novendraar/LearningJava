package com.pembekalan.xsisacademy.entity;

import java.time.LocalDate;

// import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "books")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Books extends BaseEntity {

    public Books(String title, String synopsis, Integer stock, LocalDate publishedAt, Authors author,
            Category category, Publisher publisher) {
        this.title = title;
        this.stock = stock;
        this.synopsis = synopsis;
        this.published_at = publishedAt;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String synopsis;
    private Integer stock;
    private LocalDate published_at;

    // @ManyToOne
    // @JoinColumn(name = "author_id", insertable = false, updatable = false,
    // nullable = false) // referensi kolom id
    // // author
    // private Authors author;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false) // referensi kolom id
                                                      // author
    private Authors author;

    // @Column(name = "product_id")
    // private Integer productId;

    // @ManyToOne
    // @JoinColumn(name = "category_id", insertable = false, updatable = false,
    // nullable = false) // referensi kolom id
    // // category
    // private Category category;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false) // referensi kolom id
                                                        // category
    private Category category;

    // @Column(name = "category_id")
    // private Integer categoryId;

    // @ManyToOne
    // @JoinColumn(name = "publisher_id", insertable = false, updatable = false) //
    // referensi kolom id publisher
    // private Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "publisher_id", nullable = false) // referensi kolom id publisher
    private Publisher publisher;

    // @Column(name = "publisher_id")
    // private Integer publisherId;
}
