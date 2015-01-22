/* creamos una clase llamada IMC que contiene a todos los atributos
y compruebo si la altura y la masa son diferentes de 0*/

public class IMC {
        private double Altura;
        private double Masa;
        private String Nombre;
        private double Edad;
        private String Correo;
        private double Celular;

        public IMC(double altura, double masa, String nombre) {
	            if (altura > 0 && masa > 0) {
		                  this.altura = altura;
		                  this.masa = masa;
		                  this.nombre = nombre;
		                  this.edad = edad;
		                  this.correo = correo;
		                  this.celular = celular;
	            } else {
		                  this.altura = 0;
		                  this.masa = 0;
		                  this.nombre = " ";
		                  this.edad = 0;
		                  this.correo = " ";
		                  this.celular = 0;
	           }
        }


/* genero los returns */

public double getAltura() {
   return altura;
}

public double getMasa() {
   return masa;
}

public String getNombre() {
   return nombre;
}

public double getEdad() {
   return nombre;
}

public String getCorreo() {
   return nombre;
}

public double getCelular() {
   return nombre;
}


/* calculo el IMC */

public double calcularIMC() {
   if (getAltura() > 0) {
      return Masa/(Altura*Altura);
   } else {
      return 0;
   }
}


/* método para devolver un String en función del IMC de cada quien */

public String estado(){
   double valor = calcularIMC();
   if (valor < 18.5 ){ 
      return "Demasiado delgado/a";
   } else if (valor >= 18.5 && valor <25) { 
      return "Normal";
   } else if (valor >=25 && valor <30) {
      return "Ligero sobrepeso";
   } else {
      return "Obesidad";
   }
}


/* mostrar mensaje con toda la información contenida */

public void datosPersona() {

   String imc = String.format(
      "Paciente : %s\nPeso : %.2f Kg\nAltura : %.2f m\n\n"
          + "IMC : %.2f\nEstado : %s\n\n", getNombre(),
             getMasa(), getAltura(), getEdad(), getCorreo(),
             getCelular(), calcularIMC(), estado());

   if (calcularIMC() > 0) {
      JOptionPane.showMessageDialog(null, imc, "IMC", JOptionPane.INFORMATION_MESSAGE);
   }
}


/* se crea un cuadro de diálogo para solicitar la información y si todo es correcto se muestra el resultado */

import javax.swing.JOptionPane;

public class CalcularIMC {

      public static void main(String[] args) {
         String a, p, c, e;
         String nombre = null;
         String correo = null;
         double celular = 0;
         double altura = 0;
         double peso = 0;
         double edad = 0;

         try {
            nombre = JOptionPane.showInputDialog(null, "Introduce tu Nombre",
            "IMC", JOptionPane.PLAIN_MESSAGE);
            correo = JOptionPane.showInputDialog(null, "Introduce tu Correo",
            "IMC", JOptionPane.PLAIN_MESSAGE);
            celular = JOptionPane.showInputDialog(null, "Introduce tu Celular",
            "IMC", JOptionPane.PLAIN_MESSAGE);
            a = JOptionPane.showInputDialog(null,
            "Introduce tu altura (Ejem: 1.80)", "IMC",
            JOptionPane.PLAIN_MESSAGE);
            p = JOptionPane.showInputDialog(null,
            "Introduce tu peso (Ejem: 80.2)", "IMC",
            JOptionPane.PLAIN_MESSAGE);
            e = JOptionPane.showInputDialog(null,
            "Introduce tu edad (Ejem: 20)", "IMC",
            JOptionPane.PLAIN_MESSAGE);
            

            altura = Double.parseDouble(a);
            peso = Double.parseDouble(p);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error",
            JOptionPane.ERROR_MESSAGE);
            }

      IMC imc = new IMC(altura, peso, nombre);
      imc.datosPersona();
      }
}
