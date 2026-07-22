package ec.edu.ups.icc.proyectoFinal.categories.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.edu.ups.icc.proyectoFinal.categories.entity.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
    boolean existsByName(String name);
}
