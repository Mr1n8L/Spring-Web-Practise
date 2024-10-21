package com.practise.Spring.Web.Practise.Repository;

import com.practise.Spring.Web.Practise.Model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productRepository extends JpaRepository<product, Integer> {

}
