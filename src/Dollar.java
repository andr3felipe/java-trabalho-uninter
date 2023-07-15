public class Dollar extends Moeda {

    public Dollar(double valor) {
        super(valor);
    }

    @Override
    String info() {
       return "Dolar: " + valor;
    }

    @Override
    double converter() {
        return this.valor * 4.80;
    }

    @Override
    void set(double valor) {
        this.valor += valor;
    }

    @Override
    double get() {
        return this.valor;
    }
}
