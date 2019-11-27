package creacion.builder;

public class Main
{
    public static void main(String[] args)
    {
    	PreguntasParical parcial1 = new PreguntasParical();	
    	
    	PreguntasParical parcia2 = new PreguntasParical("Nose", 10, true,true,true,true,true);	
    	
    	
    	PreguntasParical parcial3 = PreguntasParical
    			.newBuilder()
    			.withpaIsMasGrande("Brasil")
    			.withCantDePaisesLatinoamerica(11)
    			.withCordobaEsPais(false)
    			.withDinamarcaEsLATAM(false)
    			.withBrasilEsLATAM(true)
    			.withBoliviaEsLATAM(true)
    			.withRumaniaLATAM(true)
    			.build();
   
    	
    	System.out.println(parcial3.toString());
    }
}