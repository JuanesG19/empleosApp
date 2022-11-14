package net.juanes.service;

import net.juanes.model.Categoria;

import java.util.List;

public interface ICategoriasService {

    void guardar(Categoria categoria);

    List<Categoria> buscarTodas();

    Categoria buscarPorId(Integer idCategoria);
}
