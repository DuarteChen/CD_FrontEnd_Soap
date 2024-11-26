import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.jws.WebParam;
import javax.jws.WebService;


@WebService(targetNamespace = "http://default_package/", portName = "FrontEnd_ClinicaPort", serviceName = "FrontEnd_ClinicaService")
public class FrontEnd_Clinica {
	
	
	//String addServerURL = "rmi://" + "192.168.128.2" + "/AddServer"; //Duarte
	String addServerURL = "rmi://" + "192.168.56.101" + "/AddServer"; //Akash
	
	

    public String listarConsultas_Server(int idClient) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
    	String idClicentString = "" + idClient;
  
        

		return addServerIntf.listarConsultas(idClicentString);

    }
    
    public String marcarConsultas_Server(int dia, int mes, int ano, int hora, int clientID, int clinicaID, int especialidadeID) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.marcarConsulta(dia, mes, ano, hora, clientID, clinicaID, especialidadeID);

    }
    
    
    public String listarClinicas_Server() throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
    	
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.listarClinicas();

    }
    
    public String listarEspecialidades_Server(int idClinica) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
   
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.listarEspecialidades(idClinica);

    }
    
    public String removerConsulta_Server(int idConsulta) throws MalformedURLException, RemoteException, NotBoundException {
    	   
    	
  
    	AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
    	
  
        

		return addServerIntf.removerConsulta(idConsulta);

    }
    
    public String Registar(String userName, String password) throws IOException {
        // Caminho para o arquivo onde os usuários serão salvos
        File file = new File("C:\\Users\\akash\\Desktop\\DadosUser.txt");

        // Se o arquivo não existir, cria o arquivo
        if (!file.exists()) {
            boolean created = file.createNewFile(); // Cria o arquivo se não existir
            if (!created) {
                throw new IOException("Erro ao criar o arquivo DadosUser.txt");
            }
        }

        // Verificar se o usuário já existe
        if (usuarioExiste(userName)) {
            return "Usuário já existe!";
        } else {
            // Obter o próximo ID
            int nextId = getNextId(file);

            // Escrever o novo usuário no arquivo com o ID
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write(nextId + ":" + userName + ":" + password); // Salva o usuário no formato id:userName:password
                writer.newLine(); // Adiciona uma nova linha
            }
            return "Usuário registrado com sucesso!";
        }
    }

    // Método para verificar se o usuário já existe
    private boolean usuarioExiste(String userName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("\"C:\\Users\\akash\\eclipse-workspace\\CD_FrontEnd_Soap\\DadosUser.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Verificar se o nome de usuário já existe (compara apenas o nome do usuário antes dos dois pontos)
                String storedUserName = line.split(":")[1]; // O username está no segundo campo após o ID
                if (storedUserName.equals(userName)) {
                    return true; // Usuário encontrado
                }
            }
        }
        return false; // Usuário não encontrado
    }

    // Método para obter o próximo ID disponível (incrementando a partir do maior ID atual)
    private int getNextId(File file) throws IOException {
        int maxId = 0;

        // Ler todas as linhas do arquivo para determinar o maior ID
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String idStr = line.split(":")[0]; // O ID está no primeiro campo antes dos dois pontos
                try {
                    int id = Integer.parseInt(idStr);
                    maxId = Math.max(maxId, id); // Atualiza o maior ID encontrado
                } catch (NumberFormatException e) {
                    // Ignora linhas que não possam ser convertidas para inteiro (caso haja alguma linha inválida)
                }
            }
        }

        return maxId + 1; // Retorna o próximo ID disponível
    }
    
    
    public String autenticar(String userName, String password) throws IOException {
        // Lê o arquivo e verifica se o usuário e a senha correspondem
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\akash\\Desktop\\DadosUser.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String storedId = parts[0]; // O ID está no primeiro campo
                String storedUserName = parts[1]; // O username está no segundo campo
                String storedPassword = parts[2]; // A senha está no terceiro campo

                // Se o username e a senha corresponderem
                if (storedUserName.equals(userName) && storedPassword.equals(password)) {
                    return storedId; // Retorna o ID do usuário autenticado
                }
            }
        }
        System.out.println("Credenciais errado");
        return "0"; // Nome de usuário ou senha inválidos, retorna null
    }


    
}