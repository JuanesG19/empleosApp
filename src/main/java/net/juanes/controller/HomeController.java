package net.juanes.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import net.juanes.model.Vacante;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/tabla")
    public String mostrarTabla(Model model) {
        List<Vacante> lista = getVacantes();
        model.addAttribute("vacantes", lista);

        return "tabla";
    }

    @GetMapping("/detalle")
    public String mostrarDetalle(Model model) {
        Vacante vacante = new Vacante();

        vacante.setNombre("Ingeniero de Comunicaciones");
        vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
        vacante.setFecha(new Date());
        vacante.setSalario(9700);

        model.addAttribute("vacante", vacante);
        return "detalle";
    }

    @GetMapping("/listado")
    public String mostarListado(Model model) {
        List<String> lista = new LinkedList<String>();
        lista.add("Ingeniero de Sistemas");
        lista.add("Auxiliar de Contabilidad");
        lista.add("Vendedor");
        lista.add("Arquitecto");


        model.addAttribute("empleos", lista);
        return "listado";
    }


    @GetMapping("/")
    public String mostrarHome(Model model) {
        /**
         model.addAttribute("mensaje", "Pagina Para Buscar Empleos");
         model.addAttribute("fecha", new Date());
         */

        String nombre = "Auxiliar de Contabilidad";
        Date fechaPub = new Date();
        double salario = 90000;
        boolean vigente = true;

        model.addAttribute("nombre", nombre);
        model.addAttribute("fechaPub", fechaPub);
        model.addAttribute("salario", salario);
        model.addAttribute("vigente", vigente);


        return "home";
    }

    private List<Vacante> getVacantes() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        List<Vacante> lista = new LinkedList<Vacante>();

        try {
            Vacante vacante1 = new Vacante();
            vacante1.setId(1);
            vacante1.setNombre("Ingeniero Civil");
            vacante1.setDescripcion("Solicitamos Ing. Civil para diseñar un puente peatonal");
            vacante1.setFecha(new Date());
            vacante1.setSalario(8500);
            vacante1.setDestacado(1);

            Vacante vacante2 = new Vacante();
            vacante2.setId(1);
            vacante2.setNombre("Contador Publico");
            vacante2.setDescripcion("Empresa importante solicita contador con 5 años de experiencia titulado");
            vacante2.setFecha(new Date());
            vacante2.setSalario(12000);
            vacante2.setDestacado(0);

            Vacante vacante3 = new Vacante();
            vacante3.setId(1);
            vacante3.setNombre("Ingeniero Electronico");
            vacante3.setDescripcion("Empresa internacional solicita ingeniero mecanico para mantenimiento de la instalacion electrica");
            vacante3.setFecha(new Date());
            vacante3.setSalario(10500);
            vacante3.setDestacado(0);

            Vacante vacante4 = new Vacante();
            vacante4.setId(1);
            vacante4.setNombre("Diseñador Grafico");
            vacante4.setDescripcion("Solicitamos diseñador grafico titulado para diseñar publicidad de la empresa");
            vacante4.setFecha(new Date());
            vacante4.setSalario(7500);
            vacante4.setDestacado(1);

            lista.add(vacante1);
            lista.add(vacante2);
            lista.add(vacante3);
            lista.add(vacante4);

        } catch (Exception e) {
            System.out.printf("Error" + e.getMessage());
        }

        return lista;
    }
}
