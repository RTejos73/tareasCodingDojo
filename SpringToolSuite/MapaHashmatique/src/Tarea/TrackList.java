package Tarea;

public class TrackList {

	public static void main(String[] args) {
		
		
		CancionesHash cancionesHash = new CancionesHash();
		
		cancionesHash.agregaCancion("Por Primera Vez", "Tengo Tantas ganas\n" +
						"Ay, de besarte en las mañanas, justo cuando te levantas (Te amo)\n" +
						"Pero tengo miedo (Tengo miedo)\n" +
						"Que busques a alguien perfecto y yo tan de carne y hueso (Te amo)\n");
		cancionesHash.agregaCancion("Todo de ti", "One, two\n" +
						"One, two, three\n" +
						"Dice, Ra-Rauw\n" +
						"El viento soba tu cabello\n" +
						"Uh-uh-uh-uh-uh\n");
		
		cancionesHash.agregaCancion("Loco Enamorado", "Cuando escuches un te amo piensa en mi\n" +
						"Cuando te diga te quiero se feliz\n" +
						"Tu amor me hadado todo\n" +
						"Y no sé qué sería de mi si tu no estuvieras aquí\n" +
						"Eres mi vida mi cielo mi amor\n");
		
		cancionesHash.agregaCancion("Pensando en ti", "Pensando en ti...\n" +
						"Ninguna herida sana sin cicatriz.\n" +
						"Como cientos de dominoes en fila\n" +
						"cuando algún dedo el primero derriba\n" +
						"Como una casa hecha con cartas," +
						"alta, hasta que una tormenta\n" +
						"sopla su puerta de forma agresiva.\n");	
		
		
		
		System.out.println("Cancion :  Por Primera vez");
		System.out.println(cancionesHash.leeLirica("Por Primera Vez"));
		
		System.out.println("Cancion  : Pensando en ti");
		System.out.println(cancionesHash.leeLirica("Pensando en ti"));
		
	}
	
	
	
	
	

}
