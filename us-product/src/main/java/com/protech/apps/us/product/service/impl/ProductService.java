
package com.protech.apps.us.product.service.impl;

import com.protech.apps.us.product.dao.ProductRepository;
import com.protech.apps.us.product.entities.Product;
import com.protech.apps.us.product.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author BLU Kwensy Eli
 */
@Service
@Transactional
public class ProductService implements IProductService{

    @Autowired ProductRepository productRepository;
    
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product findOne(Long id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }
    
    
}
