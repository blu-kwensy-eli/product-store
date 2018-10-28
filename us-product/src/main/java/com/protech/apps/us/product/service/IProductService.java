
package com.protech.apps.us.product.service;

import com.protech.apps.us.product.entities.Product;
import java.util.List;

/**
 *
 * @author BLU Kwensy Eli
 */
public interface IProductService {
    
    public Product save(Product product);
    
    public Product findOne(Long id);
    
    public Product update(Product product);
    
    public List<Product> findAll();
    
    public void delete(Product product);
}
