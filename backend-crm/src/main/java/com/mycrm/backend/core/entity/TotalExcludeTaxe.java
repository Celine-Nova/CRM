package com.mycrm.backend.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

// Créer une entité pour accéder a la vue SQL
@Entity
@Table(name = "v_totalexcludetaxe")
public class TotalExcludeTaxe implements Serializable {
   private static final long serialVersionUID = 1L;
   @Id
//    @Column(name = "v_totalexcludetaxe_id")
//    private Long v_totalexcludetaxe;
    @Column(name="typePresta", length = 100, insertable = false, updatable = false)
    private String typePresta;

    @Column(name="unitPrice",precision = 9, scale = 2,insertable = false, updatable = false)
    private Double unitPrice;

    @Column(name = "nbDays", length = 11,insertable = false, updatable = false)
    private int nbDays;

    @Column(name = "totalHT", length = 11,insertable = false, updatable = false)
    private String totalHt;

    public String getTypePresta() {
        return typePresta;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public int getNbDays() {
        return nbDays;
    }

    public String getTotalHt() {
        return totalHt;
    }

    @Override
    public String toString() {
        return "TotalExcludeTaxe{" +
                "typePresta='" + typePresta + '\'' +
                ", unitPrice=" + unitPrice +
                ", nbDays=" + nbDays +
                ", totalHt='" + totalHt + '\'' +
                '}';
    }
}
