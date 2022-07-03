package com.mycrm.backend.core.repository;

import com.mycrm.backend.core.entity.Order;
import com.mycrm.backend.core.entity.TotalExcludeTaxe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcludeTaxeRepository extends JpaRepository<TotalExcludeTaxe, Long> {
}
