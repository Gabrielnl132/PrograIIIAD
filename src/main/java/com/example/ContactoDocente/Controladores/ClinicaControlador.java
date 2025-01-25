package com.example.ContactoDocente.Controladores;

import com.example.ContactoDocente.Entidad.Clinica;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ClinicaControlador {

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        Clinica clinica = new Clinica();
        model.addAttribute("clinica", clinica);

        // Lista de géneros para seleccionar
        List<String> listaGeneros = Arrays.asList("Masculino", "Femenino", "Otro");
        model.addAttribute("generos", listaGeneros);

        // Lista de estados civiles para seleccionar
        List<String> listaEstadosCiviles = Arrays.asList("Soltero", "Casado", "Divorciado", "Viudo");
        model.addAttribute("estadosCiviles", listaEstadosCiviles);

        return "pages/formulario";
    }

    @PostMapping("/registrar")
    public String registrarHistoriaClinica(
            @Valid @ModelAttribute Clinica clinica,
            BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            // Si hay errores de validación, se vuelve a cargar las listas de selección
            List<String> listaGeneros = Arrays.asList("Masculino", "Femenino", "Otro");
            model.addAttribute("generos", listaGeneros);

            List<String> listaEstadosCiviles = Arrays.asList("Soltero", "Casado", "Divorciado", "Viudo");
            model.addAttribute("estadosCiviles", listaEstadosCiviles);

            model.addAttribute("errores", bindingResult.getAllErrors());
            return "pages/formulario";
        } else {
            // Simular el registro de la historia clínica
            System.out.println("Historia clínica registrada: " + clinica);
            return "pages/registroExitoso";
        }
    }
}
