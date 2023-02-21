package net.product.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.product.springboot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
