package test;
import dao.OdontologoDAOLista;
import modelo.Odontologo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import servicio.OdontologoServicio;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OdontologoTest {

    private OdontologoServicio odontologoService;

    @BeforeEach
    public void setUp() {
        odontologoService = new OdontologoServicio(new OdontologoDAOLista());
        odontologoService.registrarOdontologo("1234", "Juan", "Pérez");
        odontologoService.registrarOdontologo("5678", "Ana", "Gómez");
    }

    @Test
    public void testListarOdontologos() {
        List<Odontologo> odontologos = odontologoService.obtenerTodosLosOdontologos();
        assertEquals(2, odontologos.size(), "Debe haber 2 odontólogos en la lista");
        assertEquals("1234", odontologos.get(0).getNumeroMatricula());
        assertEquals("5678", odontologos.get(1).getNumeroMatricula());
    }
}
