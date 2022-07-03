package com.mycrm.backend.core.entity;

import com.mycrm.backend.core.state.OrderState;

import javax.persistence.*;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 11)
    private Long id;

    @Column(name= "designation", nullable = false, length = 100)
    private String designation;

    @Column(name = "nbDays", length = 11)
    private int nbDays;

//    @Column(name="totalexcludetaxe",precision = 9, scale = 2)
//    private Double totalExcludeTaxe;

    // precision nombre de chiffre au total
    // scale nombre de chiffre après la virgule
//    @Column(name="totalincludetaxe", precision = 9, scale = 2)
//    private Double totalWithTaxe;

    @Column(name="typePresta", length = 100)
    private String typePresta;

    @Column(name="unitPrice",precision = 9, scale = 2)
    private Double unitPrice;

    @Column(name="state", nullable = false, columnDefinition = "INT(1) DEFAULT '0'") // => Sql type Integer valeur par default 0 == INACTIVE
    // ou @ColumnDefault("0")
    @Enumerated(EnumType.ORDINAL) // => Renvoie Integer
    private OrderState state;


    @JoinColumn(name = "customer_id", nullable = false)
    @ManyToOne(cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    private Customer customer;

    public Order() {

    }

    public Order(String designation, int nbDays, String typePresta, Double unitPrice) {
        this.designation = designation;
        this.nbDays = nbDays;
        this.typePresta = typePresta;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getNbDays() {
        return nbDays;
    }

    public void setNbDays(int nbDays) {
        this.nbDays = nbDays;
    }

//    public Double getTotalExcludeTaxe() {
//        return totalExcludeTaxe;
//    }
//
//    public void setTotalExcludeTaxe(Double totalExcludeTaxe) {
//        this.totalExcludeTaxe = totalExcludeTaxe;
//    }

//    public Double getTotalWithTaxe() {
//        return totalWithTaxe;
//    }
//
//    public void setTotalWithTaxe(Double totalWithTaxe) {
//        this.totalWithTaxe = totalWithTaxe;
//    }

    public String getTypePresta() {
        return typePresta;
    }

    public void setTypePresta(String typePresta) {
        this.typePresta = typePresta;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", nbDays=" + nbDays +
//                ", totalExcludeTaxe=" + totalExcludeTaxe +
//                ", totalWithTaxe=" + totalWithTaxe +
                ", typePresta='" + typePresta + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
