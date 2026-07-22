package ec.edu.ups.icc.proyectoFinal.categories.service;

import java.util.List;

import ec.edu.ups.icc.proyectoFinal.categories.dto.request.CategoryRequestDTO;
import ec.edu.ups.icc.proyectoFinal.categories.dto.response.CategoryResponseDTO;

public interface CategoryService {
    
    //obtener todo
    List<CategoryResponseDTO> getAllCategories();
}
