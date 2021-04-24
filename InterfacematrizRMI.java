import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * Tarea 6. Multiplicación de matrices utilizando objetos distribuidos
 * Becerril Saldivar Luis Alejandro
*/

public interface InterfacematrizRMI extends Remote{
    
    /**Declaramos los parametros que ingresara y retornara
     * @param A
     * @param B
     * @return AxB[N/2][N/2]
     * @throws RemoteException
     */
    public float[][] multiplica_matrices(float[][] A, float[][] B) throws RemoteException;
    
// fin interfaceRMI
}