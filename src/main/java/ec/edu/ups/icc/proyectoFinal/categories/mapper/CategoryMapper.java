package ec.edu.ups.icc.proyectoFinal.categories.mapper;

import org.springframework.stereotype.Component;

import ec.edu.ups.icc.proyectoFinal.categories.dto.request.CategoryRequestDTO;
import ec.edu.ups.icc.proyectoFinal.categories.dto.response.CategoryResponseDTO;
import ec.edu.ups.icc.proyectoFinal.categories.entity.Category;

@Component
public class CategoryMapper {
    
    // De entidad a dto para responder
    public CategoryResponseDTO toResponseDTO(Category category){
        if(category == null){
            return null;
        }
        return new CategoryResponseDTO(
            category.getId(),
            category.getName(),
            category.getDescription(),
            category.getActive(),
            category.getCreatedAt(),
            category.getUpdatedAt()
        );
    }

    
}
