package Extender;

public class Controladora {

	public static void main(String[] args) {
    Medico m = new Medico();
    m.darConsultaMedica();
    m.segumientoDeSalud();
    
     Arbitro a = new Arbitro();
     a.partidoFutbol();
	 a.sacarTarjeta();
	 a.verPartido();
	 
	 Entrenador e = new Entrenador();
	 e.dirigirPartido();
    e.dirigirEntreno();
    e.verPartido();
    
    Futbolista f = new Futbolista();
    f.jugarPartido();
    f.entrenar();
    f.verPartido();
    
     Masajista mas = new Masajista();
    mas.entrenamiento();
    mas.darMasaje();
    mas.verPartido();
    
    DirectorTecnico dt = new DirectorTecnico();
    dt.supervisar();
    dt.darOrdenes();
    dt.verPartido();
    
    Nutriologo n = new Nutriologo();
    n.darConsulta();
    n.verPartido();
    
    Patrocinador p = new Patrocinador();
    p.patrocinar();
    p.verPartido();
    
    Animadoras ani = new Animadoras();
    ani.verPartido();
    ani.animarEquipo();
	}
}