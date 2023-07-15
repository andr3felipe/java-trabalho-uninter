
abstract public class Moeda {
    double valor;

    public Moeda(double valor) {
        super();
        this.valor = valor;
    }

    abstract String info();

    abstract double converter();

    abstract void set(double valor);

    abstract double get();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(moeda.valor, valor) == 0;
    }
}
