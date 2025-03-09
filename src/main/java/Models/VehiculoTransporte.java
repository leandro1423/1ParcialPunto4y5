package Models;

public class VehiculoTransporte extends Vehiculo {

    private int maximoPasajeros;
    private int pasajerosTransportados;

    // 🔹 Constructor privado para forzar el uso del Builder
    private VehiculoTransporte(Builder builder) {
        super(builder);
        this.maximoPasajeros = builder.maximoPasajeros;
        this.pasajerosTransportados = builder.pasajerosTransportados;
    }

    // 🔹 Getters
    public int getMaximoPasajeros() { return maximoPasajeros; }
    public int getPasajerosTransportados() { return pasajerosTransportados; }

    // 🔹 Builder para VehiculoTransporte
    public static class Builder extends Vehiculo.Builder {
        private int maximoPasajeros;
        private int pasajerosTransportados;

        public Builder setMaximoPasajeros(int maximoPasajeros) {
            this.maximoPasajeros = maximoPasajeros;
            return this;
        }

        public Builder setPasajerosTransportados(int pasajerosTransportados) {
            this.pasajerosTransportados = pasajerosTransportados;
            return this;
        }

        @Override
        public VehiculoTransporte build() {
            return new VehiculoTransporte(this);
        }
    }
}
