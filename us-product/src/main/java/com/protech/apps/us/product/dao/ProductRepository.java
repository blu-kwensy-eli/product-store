
package com.protech.apps.us.product.dao;

import com.protech.apps.us.product.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author BLU Kwensy Eli
 */
public interface ProductRepository extends JpaRepository<Product, Long>{
    
}
