package calcularprecio;

import javax.swing.JOptionPane;



public class CalcularPrecio {

    final double Precio = 4200;
    private double numKilo;
    private double totalApagar;
    private double valor1;

        public CalcularPrecio(double numKilo) {
            this.numKilo = numKilo;
        }

    public double getPrecio() {
        return Precio;
    }

    public double getNumKilo() {
        return numKilo;
    }

    public double getTotalApagar() {
        return totalApagar;
    }

    public double calcularTotal(int numKilo){
        double valor1 = 0;
        //double valor2;
        if(numKilo>0 && numKilo<=2){
            totalApagar=Precio*numKilo;
        }else if(numKilo>2 && numKilo<=5){
            valor1=(Precio*numKilo)*10/100;
            totalApagar=Precio*numKilo-valor1;  
        }else if(numKilo>5 && numKilo<=10){
            valor1=(Precio*numKilo)*15/100;
            totalApagar=Precio*numKilo-valor1;
         }else{
            valor1=(Precio*numKilo)*20/100;
            totalApagar=Precio*numKilo-valor1;
        }   
        return Precio*numKilo-valor1;
    }
            
    public static void main(String[] args) {
     String numStrng=JOptionPane.showInputDialog("Ingresar cantidad de kilos");
     int numInt = Integer.parseInt(numStrng);
     CalcularPrecio cliente = new CalcularPrecio(numInt);
     JOptionPane.showMessageDialog(null,"la compra de "+numInt +" kilos tiene un valor de "+cliente.calcularTotal(numInt)
     +"\nPero usted tiene un descuento por valor de "+cliente.valor1
     +"\npor lo tanto usted debe pagar"+cliente.calcularTotal(numInt));
        
        
    }
    
}
