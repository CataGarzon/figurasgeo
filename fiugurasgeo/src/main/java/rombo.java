public class rombo extends figuras {
    private double longitud;
    private double diagonalMayor, diagonalMenor;
    private double areaR, perimetroR;

    
     public double getAreaR() {
        return areaR;
    }
    public void setAreaR(double areaR) {
        this.areaR = areaR;
    }
    public double getPerimetroR() {
        return perimetroR;
    }
    public void setPerimetroR(double perimetroR) {
        this.perimetroR = perimetroR;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
 
    
   public rombo(){}
 
   public rombo(double areaR, double perimetroR, double longitud, double diagonalMayor, double diagonalMenor) {
    this.areaR = areaR;
    this.perimetroR = perimetroR;
    this.longitud = longitud;
    this.diagonalMayor = diagonalMayor;
    this.diagonalMenor = diagonalMenor;
}

    /////////////////////////////////////////////////////////
 
   @Override
    public double calcularArea()
    {
        
        areaR= getDiagonalMayor()*getDiagonalMenor();
        areaR= areaR/2;
        System.out.println("el area es: "+areaR);
        return areaR;
     
    }  
    @Override
    public double calcularPerimetro()
    {
        perimetroR = getLongitud()*4;
        System.out.println("el perimetro es: "+ perimetroR);
       return perimetroR;
        

    }    
    
}
