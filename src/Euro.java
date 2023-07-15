public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    String info() {
        return "Euro: " + valor;
    }

    @Override
    void set(double valor) {
        this.valor += valor;
    }

    @Override
    double get() {
        return this.valor;
    }

    @Override
    double converter() {
        return 5.39 * valor;
    }
}
