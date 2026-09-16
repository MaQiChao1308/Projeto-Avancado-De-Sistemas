import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColecaoTituloList {
    private ArrayList<Titulo> titulos = new ArrayList<Titulo>();

    public ColecaoTituloList(ArrayList<Titulo> titulos) {
        this.titulos = titulos;
    }
    
    public boolean adicionaTitulo(Titulo titulo)
    {   

        if(this.titulos.contains(titulo))
        {
            return false;
        }
        else
        {
            titulos.add(titulo);
            return true;
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
