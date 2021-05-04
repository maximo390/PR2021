package poo;

public class Tigre extends Mamifero{
    public Tigre(int patasP){
        super(patasP);
    }
    
    public Camaleon alimentar(Camaleon c, int nHuevos){
        
        if(c.getHuevo()-nHuevos>=0){
            c.setHuevo(c.getHuevo()-nHuevos);
        }else{
            c.setHuevo(0);
        }
        return c;
    }
    
    public Camaleon buscar(Camaleon c){
        
        if(c.getColor()=="oculto"){
            c.setColor("verde");
            c.correr();
        }else{
            c.correr();
        }
        return c;
    }
    
    public void setCrias(int c){
        super.setCrias(c);
    }
    
    public void Grunir(){
        super.Grunir();
    }

}
