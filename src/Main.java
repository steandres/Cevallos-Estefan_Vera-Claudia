import dao.OdontologoDAOLista;
import servicio.OdontologoServicio;

public class Main {
    public static void main(String[] args) {
        OdontologoServicio odontologoService = new OdontologoServicio(new OdontologoDAOLista());

        odontologoService.registrarOdontologo("1234", "Julian", "Mozquera");
        odontologoService.registrarOdontologo("5678", "Ana", "Gonzalez");

        System.out.println("Lista de odontólogos:");
        odontologoService.obtenerTodosLosOdontologos().forEach(System.out::println);
    }
}
