package com.tinytong.springbootest.repository;

import com.tinytong.springbootest.enity.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepositoey extends JpaRepository<Buyer,String> {
}
