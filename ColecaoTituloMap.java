import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class ColecaoTituloMap {
    
    private HashMap<String, Titulo> titulos;

    public ColecaoTituloMap() {
        this.titulos = new HashMap<String, Titulo>();
    }

    public boolean adicionaTitulo(Titulo titulo) {
        if (titulo == null || titulo.getDescricao() == null) {
            return false;
        }

        if (!this.titulos.containsKey(titulo.getDescricao())) {
            this.titulos.put(titulo.getDescricao(), titulo);
            return true;
        } else {
            return false;
        }
    }

    public double balanco() {
        double tituloR = 0;
        double tituloP = 0;
        Iterator<Titulo> it = this.titulos.values().iterator();

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
        return new ArrayList<Titulo>(this.titulos.values());
    }
}
