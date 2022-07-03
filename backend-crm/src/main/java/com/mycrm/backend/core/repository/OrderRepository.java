package com.mycrm.backend.core.repository;

import com.mycrm.backend.core.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> { // = <NomEntity, TypeId>
        //Contient Methode de base DAO = CRUD => JpaRepository utilise Hibernate
        // Je peux ajouter des methodes plus précises que Jpa fera tout seul
        // ex :  public List<Order> findAllByTypePresta(String typePresta);

}
