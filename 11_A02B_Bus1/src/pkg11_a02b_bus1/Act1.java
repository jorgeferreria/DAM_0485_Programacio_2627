package pkg11_a02b_bus1;

public class Act1 {

    public static void main(String[] args) {
        
        // VARIABLES
        int clientsPugen, clientsBaixen, totalClients = 0, 
                clientsStop1, clientsStop2 , clientsStop3;
        
        
        //CODI
        
        // PRIMERA PARADA
        clientsBaixen = 0;
        clientsPugen = 6;
        
        clientsStop1 = clientsBaixen + clientsPugen; // 6
        totalClients = totalClients + clientsPugen;
        
        // SEGONA PARADA
        clientsBaixen = 3;
        clientsPugen = 8;
        
        clientsStop2 = clientsStop1 - clientsBaixen + clientsPugen; // 11
        totalClients = totalClients + clientsPugen;
        
        // TERCERA PARADA
        clientsBaixen = 4;
        clientsPugen = 5;
        
        clientsStop3 = clientsStop2 - clientsBaixen + clientsPugen; // 12
        totalClients = totalClients + clientsPugen;
        
        System.out.println("Clientes parada 1: \t\t" + clientsStop1 );
        System.out.println("Clientes parada 2: \t\t" + clientsStop2 );
        System.out.println("Clientes parada 3: \t\t" + clientsStop3 );
        
        System.out.println("\nClientes total transportados: \t" + totalClients);
    }
    
}
