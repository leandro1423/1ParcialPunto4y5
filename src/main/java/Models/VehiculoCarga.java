package Models;

public class VehiculoCarga extends Vehiculo {

    private double capacidadCarga;
    private int numeroEjes;

    // 🔹 Constructor privado para forzar el uso del Builder
    private VehiculoCarga(Builder builder) {
        super(builder); // Llama al constructor de Vehiculo
        this.capacidadCarga = builder.capacidadCarga;
        this.numeroEjes = builder.numeroEjes;
    }

    // 🔹 Getters
    public double getCapacidadCarga() { return capacidadCarga; }
    public int getNumeroEjes() { return numeroEjes; }

    // 🔹 Builder para VehiculoCarga
    public static class Builder extends Vehiculo.Builder {
        private double capacidadCarga;
        private int numeroEjes;

        public Builder setCapacidadCarga(double capacidadCarga) {
            this.capacidadCarga = capacidadCarga;
            return this;
        }

        public Builder setNumeroEjes(int numeroEjes) {
            this.numeroEjes = numeroEjes;
            return this;
        }

        @Override
        public VehiculoCarga build() {
            return new VehiculoCarga(this);
        }
    }
}
