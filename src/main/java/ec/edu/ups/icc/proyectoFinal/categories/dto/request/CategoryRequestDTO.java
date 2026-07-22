package ec.edu.ups.icc.proyectoFinal.categories.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CategoryRequestDTO {
    
    @NotBlank(message = "El nombre de la categoría es obligatorio")
    @Size(max = 100, message = "El nombre no puede exceder los 100 caracteres")
    private String name;

    @Size(max = 255, message = "La descripción no puede exceder los 255 caracteres")
    private String description;

    @NotNull(message = "El estado activo es obligatorio")
    private Boolean active;

    public CategoryRequestDTO() {
    }

    public CategoryRequestDTO(
            @NotBlank(message = "El nombre de la categoría es obligatorio") @Size(max = 100, message = "El nombre no puede exceder los 100 caracteres") String name,
            @Size(max = 255, message = "La descripción no puede exceder los 255 caracteres") String description,
            @NotNull(message = "El estado activo es obligatorio") Boolean active) {
        this.name = name;
        this.description = description;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
