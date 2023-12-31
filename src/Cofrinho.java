import java.text.DecimalFormat;
import java.util.ArrayList;

public class Cofrinho {
    private final ArrayList<Moeda> listaMoeda = new ArrayList<>();

    public void adicionar(Moeda moeda, double amountOfCoins) {
        boolean alreadyInList = listaMoeda.contains(moeda);

        if (moeda instanceof Real) {
            System.out.println("Você adicionou " + amountOfCoins + " reais ao cofrinho.");
        }

        if (moeda instanceof Dollar) {
            System.out.println("Você adicionou " + amountOfCoins + " dolares ao cofrinho.");
        }

        if (moeda instanceof Euro) {
            System.out.println("Você adicionou " + amountOfCoins + " euros ao cofrinho.");
        }

        if (!alreadyInList) {
            listaMoeda.add((moeda));
        }

    }

    public void remover(Moeda moeda) {
        boolean  inList = listaMoeda.contains(moeda);
        if(inList) {
            if (moeda instanceof Real) {
                System.out.println(moeda.get() + " reais removidos.");
            }

            if (moeda instanceof Dollar) {
                System.out.println(moeda.get() + " dolares removidos.");
            }

            if (moeda instanceof Euro) {
                System.out.println(moeda.get() + " euros removidos.");
            }

            listaMoeda.remove(moeda);

        } else {
            System.out.println("A moeda não está no cofrinho.");
        }
    }

    public void listagemMoedas() {
        boolean isEmpty = listaMoeda.isEmpty();

        if(!isEmpty) {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : listaMoeda) {
                System.out.println(moeda.info());
            }
        } else {
            System.out.println("Você não tem moedas no cofrinho.");
        }
    }

    public void totalConvertido() {
        boolean isEmpty = listaMoeda.isEmpty();

        if (!isEmpty) {
            double total = 0;
            DecimalFormat numberFormat = new DecimalFormat("0.00");

            for(Moeda moeda: listaMoeda) {
                total += moeda.converter();
            }

            System.out.println("Valor total das moedas convertidas em Real: " + numberFormat.format(total));
        } else {
            System.out.println("Você não tem moedas no cofrinho.");
        }
    }
}
