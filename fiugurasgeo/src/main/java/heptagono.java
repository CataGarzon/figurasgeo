public class  heptagono extends figuras{
    
    
    private double lado;
    private double longitudLado;
    private double areaH;
    private double permimetroH;
    public double getAreaH() {
        return areaH;
    }
    public void setAreaH(double areaH) {
        this.areaH = areaH;
    }
    public double getPermimetroH() {
        return permimetroH;
    }
    public void setPermimetroH(double permimetroH) {
        this.permimetroH = permimetroH;
    }
   
 
public double getLado() 
{
        return lado;
    }
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    public double getLongitudLado() 
    {
        return longitudLado;
    }
    public void setLongitudLado(double longitudLado) 
    {
        this.longitudLado = longitudLado;
    }



    public void calcularAreaHeptagono()
    {

    }
    public void calcularPerimetroHeptagono()
    {

    }    
    public double calcularArea()
    {
       areaH =getLado()*7;
       System.out.println("el area del heptagono es: "+areaH);
       return areaH;
    }
    public double calcularPerimetro()
    {
        permimetroH = getLongitudLado()*4;
        System.out.println("el perimetro del heptagono es : "+ permimetroH);
        return permimetroH;
    }
    
}
