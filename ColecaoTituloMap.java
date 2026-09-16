import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;

public class ColecaoTituloMap {
    
    private HashMap<String, Titulo> titulos;

    public ColecaoTituloMap(HashMap<String, Titulo> titulos) {
        this.titulos = titulos;
    }

    public boolean adicionaTitulo(Titulo titulo)
    {
        if(!this.titulos.containsKey(titulo.getDescricao()))
        {
            this.titulos.put(titulo.getDescricao(), titulo);
            return true;
        }
        else
        {
            return false;
        }
    }

    public double balanco()
    {
        double tituloR = 0;
        double tituloP = 0;
        Iterator it = this.titulos.iterator();

        while(it.hasNext())
        {
            Titulo t = (Titulo)it.next();

            if(t instanceof TituloR)
            {
                tituloR ++;
            }
            else
            {
                tituloP ++;
            }
        }

        return tituloR-tituloP;   
    }

    public Collection<Titulo> getTitulos()
    {
        return this.titulos;
    }
    
}
