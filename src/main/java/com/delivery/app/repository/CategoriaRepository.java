package com.delivery.app.repository;

import com.delivery.app.entity.Categoria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    @Query("SELECT C FROM Categoria C WHERE C.vigencia IS 1")
    Iterable<Categoria> listarCategoriasActivas();
}
