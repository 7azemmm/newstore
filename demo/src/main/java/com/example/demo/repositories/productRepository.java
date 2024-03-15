package com.example.demo.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.product;
public interface productRepository extends JpaRepository<product , Integer> {

}
