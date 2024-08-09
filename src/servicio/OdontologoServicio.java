package servicio;

import dao.OdontologoDAO;
import modelo.Odontologo;

import java.util.List;

public class OdontologoServicio {
    private OdontologoDAO odontologoDAO;

    public OdontologoServicio(OdontologoDAO odontologoDAO) {
        this.odontologoDAO = odontologoDAO;
    }

    public void registrarOdontologo(String numeroMatricula, String nombre, String apellido) {
        Odontologo odontologo = new Odontologo(numeroMatricula, nombre, apellido);
        odontologoDAO.guardarOdontologo(odontologo);
    }

    public List<Odontologo> obtenerTodosLosOdontologos() {
        return odontologoDAO.listarOdontologos();
    }
}
