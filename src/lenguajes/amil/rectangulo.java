/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lenguajes.amil;

public class rectangulo{
  private int ladoMayor;
  private int ladoMenor;
  
  public void setMayor(int ladoMayor){
    this.ladoMayor=ladoMayor;
  }
  
  public void setMenor(int ladoMenor){
    this.ladoMenor=ladoMenor;
  }
  
  public int getMayor(){
    return ladoMayor;
  }
  
  public int getMenor(){
    return ladoMenor;
  }
  
  public int calcularArea(){
    int area = ladoMayor * ladoMenor;
    return area;
  }
}