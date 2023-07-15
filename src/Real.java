public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    String info() {
        return "Real: " + valor;
    }

    @Override
    double converter() {
        return valor;
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
