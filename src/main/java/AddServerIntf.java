import java.rmi.Remote;
import java.rmi.RemoteException;
public interface AddServerIntf extends Remote {
  String listarConsultas(String idClient) throws RemoteException;
}
