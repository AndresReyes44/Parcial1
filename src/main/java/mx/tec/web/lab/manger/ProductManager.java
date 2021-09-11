package mx.tec.web.lab.manger;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import mx.tec.web.lab.dao.ProductDAO;



@Service
public class ProductManager {
	/**
	 * Reference to the Product DAO
	 */
	@Resource
	@Qualifier("jdbc")
	private ProductDAO productDAO;
	
	/**
	 * Retrieve all the products
	 * @return List of products
	 */
	public List<ProductVO> getProducts() {
		return productDAO.findAll();
	}

	/**
	 * Retrieve an specific product based on a given product id
	 * @param id Product id
	 * @return Optional containing a product if the product was found or empty otherwise
	 */
	public Optional<ProductVO> getProduct(final long id) {
		return productDAO.findById(id);
	}

	/**
	 * Retrieve an specific product based on a given product id
	 * @param pattern Pattern to search
	 * @return Optional containing a product if the product was found or empty otherwise
	 */
	public List<ProductVO> getProducts(final String pattern) {
		return productDAO.findByNameLike(pattern);
	}
	
	/**
	 * Add a new Product to the product list based on a given product
	 * @param newProduct Product to add
	 * @return An Optional containing the new product
	 */
	public ProductVO addProduct(final ProductVO newProduct) {
		return productDAO.insert(newProduct);
	}
	
	/**
	 * Delete the product based on a given product
	 * @param existingProduct The product to delete
	 */
	public void deleteProduct(final ProductVO existingProduct) {
		productDAO.remove(existingProduct);
	}
	
	/**
	 * Update an existing product based on a given modified product and a product id
	 * @param id The product id for the original product
	 * @param modifiedProduct The product new version
	 */
	public void updateProduct(final long id, final ProductVO modifiedProduct) {
		final Optional<ProductVO> existingProduct = getProduct(id);
		
		if (existingProduct.isPresent()) {
			productDAO.update(modifiedProduct);
		}
	}		
}
