package LuzAr;

public class Casa {
    ICasa[] dispositivos;

    public Casa(ICasa[] dispositivos){
        this.dispositivos = dispositivos;
    }


  public void desligaTudo() {
      for(int i=0; i<dispositivos.length; i++){
          dispositivos[i].desligar();
      }
  }
}
