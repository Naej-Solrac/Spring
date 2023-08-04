package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.ProductoRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> { // la clase o entity  y el tipo de dato que es su clave primaria
    //de manera nativa
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    //Utilizando query methods
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria); //I mayuscula
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock,Boolean estado);
}
