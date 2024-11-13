package com.xmu.exp5jpa.repository;

import com.xmu.exp5jpa.entity.OnSalePo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OnSaleRepository extends JpaRepository<OnSalePo, Long> {

    // 根据productId查询OnSale
    List<OnSalePo> findByProductId(Long productId);

}
