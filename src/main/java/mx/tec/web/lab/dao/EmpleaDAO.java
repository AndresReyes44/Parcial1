package mx.tec.web.lab.dao;

import java.util.List;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import mx.tec.web.lab.mapper.ProductMapper;
import mx.tec.web.lab.repository.EmpleadoRepository;
import mx.tec.web.lab.repository.ProductRepository;
import mx.tec.web.lab.vo.ProductVO;

@Component("jpa")
public class EmpleaDAO  {
	/** A reference to the Product Repository */
	@Resource
	private EmpleadoRepository productRepository;
	
	/** A reference to the Product Mapper */
	@Resource
    private ProductMapper productMapper;	
	
	/** {@inheritDoc} */
	@Override
	public List<ProductVO> findAll() {
		return productMapper.convertToVOList(productRepository.findAll());
	}

	/** {@inheritDoc} */
	@Override
	public Optional<ProductVO> findById(long id) {
		return productMapper.convertToOptionalVO(productRepository.findById(id));
	}

	/** {@inheritDoc} */
	@Override
	public List<ProductVO> findByNameLike(final String pattern) {
		return productMapper.convertToVOList(productRepository.findByNameLike(pattern));
	}

	/** {@inheritDoc} */
	@Override
	public ProductVO insert(ProductVO newProduct) {
		return productMapper.convertToVO(productRepository.save(productMapper.convertToEntity(newProduct)));
	}

	/** {@inheritDoc} */
	@Override
	public void remove(ProductVO existingProduct) {
		productRepository.delete(productMapper.convertToEntity(existingProduct));
	}

	/** {@inheritDoc} */
	@Override
	public void update(ProductVO existingProduct) {
		productRepository.save(productMapper.convertToEntity(existingProduct));
	}
}