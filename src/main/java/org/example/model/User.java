package org.example.model;


import javax.persistence.*;

@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "identity")
    private String identity;

    @Column(name = "phone")
    private String phone;

    @Column(name = "income")
    private Long income;

    @Column(name = "credit_score")
    private Long creditScore;

    @Column(name = "status")
    private Long status;

}
