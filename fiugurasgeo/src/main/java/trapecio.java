public class trapecio extends figuras{
    
    private double base,altura;
   
    private double lA, lB,lC,lD;
    private double areaT;
    private double permimetroT;
   
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAreaT() {
        return areaT;
    }
    public void setAreaT(double areaT) {
        this.areaT = areaT;
    }
    public double getPermimetroT() {
        return permimetroT;
    }
    public void setPermimetroT(double permimetroT) {
        this.permimetroT = permimetroT;
    }
  
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getlA() {
        return lA;
    }
    public void setlA(double lA) {
        this.lA = lA;
    }
    public double getlB() {
        return lB;
    }
    public void setlB(double lB) {
        this.lB = lB;
    }
    public double getlC() {
        return lC;
    }
    public void setlC(double lC) {
        this.lC = lC;
    }
    public double getlD() {
        return lD;
    }
    public void setlD(double lD) {
        this.lD = lD;
    }
  
   
    public double calcularArea()
    {
     areaT = getBase() + getAltura()/2;
     System.out.println("el area del trapecio es: "+areaT);
     return areaT;
    }       
    public double calcularPerimetro()
    {
       permimetroT = getlA() + getlB() + getlC() + getlD();
       System.out.println("el perimetro es: " + permimetroT);
       return permimetroT;
    } 

    
}
