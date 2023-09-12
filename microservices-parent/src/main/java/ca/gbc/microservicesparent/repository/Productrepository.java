package ca.gbc.microservicesparent.repository;

import ca.gbc.microservicesparent.model.Product;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Productrepository extends MongoRepository<Product, String> {
    @DeleteQuery
    void deleteById(String productId);
}
