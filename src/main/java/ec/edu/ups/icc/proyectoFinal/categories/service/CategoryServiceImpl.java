package ec.edu.ups.icc.proyectoFinal.categories.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.ups.icc.proyectoFinal.categories.dto.request.CategoryRequestDTO;
import ec.edu.ups.icc.proyectoFinal.categories.dto.response.CategoryResponseDTO;
import ec.edu.ups.icc.proyectoFinal.categories.entity.Category;
import ec.edu.ups.icc.proyectoFinal.categories.mapper.CategoryMapper;
import ec.edu.ups.icc.proyectoFinal.categories.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;

    public CategoryServiceImpl(CategoryRepository categoryRepository, CategoryMapper categoryMapper) {
        this.categoryRepository = categoryRepository;
        this.categoryMapper = categoryMapper;
    }

    @Override
    @Transactional(readOnly = true)
    public List<CategoryResponseDTO> getAllCategories() {
        List<Category> categorias=categoryRepository.findAll();
        return categorias.stream()
                .map(categoryMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
