package com.example.ContactoDocente.Entidad;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Clinica {

    @Size(min = 3, max = 100, message = "El nombre debe tener entre 3 y 100 caracteres")
    @NotBlank(message = "El nombre no puede estar vacío")
    @Pattern(regexp = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$", message = "El nombre solo puede contener letras y espacios")
    private String nombre;

    @NotBlank(message = "El número de cédula es obligatorio")
    @Pattern(regexp = "^[0-9]{10}$", message = "El número de cédula debe contener exactamente 10 dígitos")
    private String cedula;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    @Past(message = "La fecha de nacimiento debe ser una fecha pasada")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;

    @NotBlank(message = "El género es obligatorio")
    @Pattern(regexp = "^(M|F|Otro)$", message = "El género debe ser 'M', 'F' o 'Otro'")
    private String genero;

    @NotBlank(message = "La dirección no puede estar vacía")
    @Size(max = 255, message = "La dirección no puede tener más de 255 caracteres")
    private String direccion;

    @NotBlank(message = "El teléfono es obligatorio")
    @Pattern(regexp = "^[0-9]{10}$", message = "El teléfono debe tener exactamente 10 dígitos")
    private String telefono;

    @NotBlank(message = "El correo es obligatorio")
    @Email(message = "Ingrese un correo válido")
    private String correo;

    @NotBlank(message = "El estado civil es obligatorio")
    @Pattern(regexp = "^(Soltero|Casado|Divorciado|Viudo)$", message = "El estado civil debe ser Soltero, Casado, Divorciado o Viudo")
    private String estadoCivil;

    @NotBlank(message = "La ocupación no puede estar vacía")
    @Size(max = 100, message = "La ocupación no puede exceder los 100 caracteres")
    private String ocupacion;

    @Size(max = 255, message = "Las alergias no pueden exceder los 255 caracteres")
    private String alergias;

    @Size(max = 255, message = "Las enfermedades preexistentes no pueden exceder los 255 caracteres")
    private String enfermedadesPreexistentes;

    @Size(max = 255, message = "Los tratamientos actuales no pueden exceder los 255 caracteres")
    private String tratamientosActuales;

    @Size(max = 255, message = "Las cirugías previas no pueden exceder los 255 caracteres")
    private String cirugiasPrevias;

    @Size(max = 255, message = "Los medicamentos en uso no pueden exceder los 255 caracteres")
    private String medicamentosEnUso;

    @Size(max = 500, message = "Las observaciones adicionales no pueden exceder los 500 caracteres")
    private String observaciones;

    @AssertTrue(message = "Debe confirmar que los datos ingresados son correctos")
    private boolean confirmacionDatos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesPreexistentes() {
        return enfermedadesPreexistentes;
    }

    public void setEnfermedadesPreexistentes(String enfermedadesPreexistentes) {
        this.enfermedadesPreexistentes = enfermedadesPreexistentes;
    }

    public String getTratamientosActuales() {
        return tratamientosActuales;
    }

    public void setTratamientosActuales(String tratamientosActuales) {
        this.tratamientosActuales = tratamientosActuales;
    }

    public String getCirugiasPrevias() {
        return cirugiasPrevias;
    }

    public void setCirugiasPrevias(String cirugiasPrevias) {
        this.cirugiasPrevias = cirugiasPrevias;
    }

    public String getMedicamentosEnUso() {
        return medicamentosEnUso;
    }

    public void setMedicamentosEnUso(String medicamentosEnUso) {
        this.medicamentosEnUso = medicamentosEnUso;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isConfirmacionDatos() {
        return confirmacionDatos;
    }

    public void setConfirmacionDatos(boolean confirmacionDatos) {
        this.confirmacionDatos = confirmacionDatos;
    }
}
