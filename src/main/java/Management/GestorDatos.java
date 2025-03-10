package Management;

import Models.Propietario;
import Models.Usuario;
import Models.VehiculoCarga;
import Models.VehiculoTransporte;

import java.util.ArrayList;

public class GestorDatos {

    private GestorDatos() { }

    private static class GestorDatosHolder {
        private static final GestorDatos INSTANCE = new GestorDatos();
    }

    public static GestorDatos getInstance() {
        return GestorDatosHolder.INSTANCE;
    }

    // 🔹 Declaración de las listas
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Propietario> propietarios = new ArrayList<>();
    private ArrayList<VehiculoCarga> vehiculosCarga = new ArrayList<>();
    private ArrayList<VehiculoTransporte> vehiculosTransporte = new ArrayList<>();

    // 🔹 Métodos GET para acceder a las listas
    public ArrayList<Usuario> getUsuarios() { return usuarios; }
    public ArrayList<Propietario> getPropietarios() { return propietarios; }
    public ArrayList<VehiculoCarga> getVehiculosCarga() { return vehiculosCarga; }
    public ArrayList<VehiculoTransporte> getVehiculosTransporte() { return vehiculosTransporte; }

    // 🔹 CRUD para Usuario
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario obtenerUsuario(int edad) {
        return usuarios.stream().filter(u -> u.getEdad() == edad).findFirst().orElse(null);
    }

    public boolean actualizarUsuario(int edad, Usuario nuevoUsuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getEdad() == edad) {
                usuarios.set(i, nuevoUsuario);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarUsuario(int edad) {
        return usuarios.removeIf(u -> u.getEdad() == edad);
    }

    // 🔹 Método para contar usuarios mayores de edad
    public int contarUsuariosMayoresEdad() {
        return (int) usuarios.stream().filter(u -> u.getEdad() >= 18).count();
    }

    // 🔹 CRUD para Propietario
    public void agregarPropietario(Propietario propietario) {
        propietarios.add(propietario);
    }

    public Propietario obtenerPropietario(String nombre) {
        return propietarios.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public boolean actualizarPropietario(String nombre, Propietario nuevoPropietario) {
        for (int i = 0; i < propietarios.size(); i++) {
            if (propietarios.get(i).getNombre().equals(nombre)) {
                propietarios.set(i, nuevoPropietario);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarPropietario(String nombre) {
        return propietarios.removeIf(p -> p.getNombre().equals(nombre));
    }

    // 🔹 CRUD para VehiculoCarga
    public void agregarVehiculoCarga(VehiculoCarga vehiculo) {
        vehiculosCarga.add(vehiculo);
    }

    public VehiculoCarga obtenerVehiculoCarga(String placa) {
        return vehiculosCarga.stream().filter(v -> v.getPlaca().equals(placa)).findFirst().orElse(null);
    }

    public boolean actualizarVehiculoCarga(String placa, VehiculoCarga nuevoVehiculo) {
        for (int i = 0; i < vehiculosCarga.size(); i++) {
            if (vehiculosCarga.get(i).getPlaca().equals(placa)) {
                vehiculosCarga.set(i, nuevoVehiculo);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarVehiculoCarga(String placa) {
        return vehiculosCarga.removeIf(v -> v.getPlaca().equals(placa));
    }

    // 🔹 CRUD para VehiculoTransporte
    public void agregarVehiculoTransporte(VehiculoTransporte vehiculo) {
        vehiculosTransporte.add(vehiculo);
    }

    public VehiculoTransporte obtenerVehiculoTransporte(String placa) {
        return vehiculosTransporte.stream().filter(v -> v.getPlaca().equals(placa)).findFirst().orElse(null);
    }

    public boolean actualizarVehiculoTransporte(String placa, VehiculoTransporte nuevoVehiculo) {
        for (int i = 0; i < vehiculosTransporte.size(); i++) {
            if (vehiculosTransporte.get(i).getPlaca().equals(placa)) {
                vehiculosTransporte.set(i, nuevoVehiculo);
                return true;
            }
        }
        return false;
    }

    public boolean eliminarVehiculoTransporte(String placa) {
        return vehiculosTransporte.removeIf(v -> v.getPlaca().equals(placa));
    }
    // 🔹 Método para calcular la cantidad total de pasajeros transportados en un día
    public int calcularTotalPasajerosDia() {
        return vehiculosTransporte.stream().mapToInt(VehiculoTransporte::getPasajerosTransportados).sum();
    }
    public int obtenerPasajerosPorVehiculo(String placa) {
        VehiculoTransporte vehiculo = vehiculosTransporte.stream()
                .filter(v -> v.getPlaca().equals(placa))
                .findFirst()
                .orElse(null);

        return (vehiculo != null) ? vehiculo.getPasajerosTransportados() : -1;  // Retorna -1 si no se encuentra
    }
    public ArrayList<Usuario> obtenerUsuariosMayoresEdad() {
        ArrayList<Usuario> mayoresEdad = new ArrayList<>();

        for (Usuario u : usuarios) {
            if (u.getEdad() >= 18) {
                mayoresEdad.add(u);
            }
        }

        return mayoresEdad;
    }



}
