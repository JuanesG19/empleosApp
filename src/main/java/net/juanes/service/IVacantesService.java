package net.juanes.service;

import net.juanes.model.Vacante;

import java.util.List;

public interface IVacantesService {
    List<Vacante> buscarTodas();

    Vacante buscarPorId(Integer idVacante);

    void guardar(Vacante vacante);

}
