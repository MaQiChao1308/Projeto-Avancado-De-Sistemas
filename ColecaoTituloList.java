import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColecaoTituloList {
    private ArrayList<Titulo> titulos;

    public ColecaoTituloList() {
        this.titulos = new ArrayList<Titulo>();
    }
    
    public boolean adicionaTitulo(Titulo titulo) {   
        if (titulo == null || titulo.getDescricao() == null) {
            return false;
        }

        if (this.titulos.contains(titulo)) {
            return false;
        }

        this.titulos.add(titulo);
        return true;
    }

    public double balanco() {
        double tituloR = 0;
        double tituloP = 0;
        Iterator<Titulo> it = this.titulos.iterator();

        while (it.hasNext()) {
            Titulo t = it.next();

            if (t instanceof TituloR) {
                tituloR += t.getValor();
            } else if (t instanceof TituloP) {
                tituloP += t.getValor();
            }
        }

        return tituloR - tituloP;
    }

    public Collection<Titulo> getTitulos() {
        return new ArrayList<Titulo>(this.titulos);
    }
}
