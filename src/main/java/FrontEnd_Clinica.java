import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.jws.WebService;


@WebService(targetNamespace = "http://default_package/", portName = "FrontEnd_ClinicaPort", serviceName = "FrontEnd_ClinicaService")
public class FrontEnd_Clinica {
	
	

    public String listarConsultas_Server(int idClient) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	String addServerURL = "rmi://" + "192.168.128.2" + "/AddServer";
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	String idClicentString = "" + idClient;
  
        

		return addServerIntf.listarConsultas(idClicentString);

    }
    
    public String marcarConsultas_Server(int dia, int mes, int ano, int hora, int clientID, int clinicaID, int especialidadeID) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	String addServerURL = "rmi://" + "192.168.128.2" + "/AddServer";
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.marcarConsulta(dia, mes, ano, hora, clientID, clinicaID, especialidadeID);

    }
    
    /*
    public String listarClinicas_Server() throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	String addServerURL = "rmi://" + "192.168.128.2" + "/AddServer";
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.listarClinicas();

    }
    
    public String listarEspecialidades_Server(int idClinica) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	String addServerURL = "rmi://" + "192.168.128.2" + "/AddServer";
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.listarEspecialidades(idClinica);

    }
*/    
    
}