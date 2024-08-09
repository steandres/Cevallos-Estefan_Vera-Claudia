package dao;

import modelo.Odontologo;
import java.util.ArrayList;
import java.util.List;

public class OdontologoDAOLista implements OdontologoDAO {
    private List<Odontologo> odontologos;

    public OdontologoDAOLista() {
        this.odontologos = new ArrayList<>();
    }

    @Override
    public void guardarOdontologo(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologos;
    }
}
