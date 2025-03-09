package Models;

public class Vehiculo {

    private String placa;
    private String modelo;
    private String marca;
    private String color;

    // 🔹 Constructor privado para obligar a usar el Builder
    Vehiculo(Builder builder) {
        this.placa = builder.placa;
        this.modelo = builder.modelo;
        this.marca = builder.marca;
        this.color = builder.color;
    }

    // 🔹 Getters
    public String getPlaca() { return placa; }
    public String getModelo() { return modelo; }
    public String getMarca() { return marca; }
    public String getColor() { return color; }

    // 🔹 Builder
    public static class Builder {
        private String placa;
        private String modelo;
        private String marca;
        private String color;

        public Builder setPlaca(String placa) {
            this.placa = placa;
            return this;
        }

        public Builder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Vehiculo build() {
            return new Vehiculo(this);
        }
    }
}
