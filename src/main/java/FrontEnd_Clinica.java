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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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
        // Path to the file where users will be saved
        File file = new File("C:\\Users\\akash\\Desktop\\DadosUser.txt");

        // Create the file if it does not exist
        if (!file.exists()) {
            boolean created = file.createNewFile();
            if (!created) {
                throw new IOException("Erro ao criar o arquivo DadosUser.txt");
            }
        }

        // Check if the user already exists
        if (usuarioExiste(userName)) {
            return "Usuário já existe!";
        } else {
            // Generate the hashed password
            String hashedPassword = hashPassword(password);

            // Get the next ID
            int nextId = getNextId(file);

            // Write the new user to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
                writer.write(nextId + ":" + userName + ":" + hashedPassword); // Save the user in id:userName:hashedPassword format
                writer.newLine();
            }
            return "Usuário registrado com sucesso!";
        }
    }

    // Method to hash a password using SHA-256
    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Erro ao gerar hash da senha", e);
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
        // Read the file and verify if the username and hashed password match
        try (BufferedReader reader = new BufferedReader(new FileReader("\"C:\\Users\\akash\\eclipse-workspace\\CD_FrontEnd_Soap\\DadosUser.txt\""))) {
            String line;
            String hashedPassword = hashPassword(password); // Hash the input password for comparison

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String storedId = parts[0];
                String storedUserName = parts[1];
                String storedPassword = parts[2];

                // If the username and hashed password match
                if (storedUserName.equals(userName) && storedPassword.equals(hashedPassword)) {
                    return storedId; // Return the ID of the authenticated user
                }
            }
        }
        System.out.println("Credenciais erradas");
        return "0"; // Invalid username or password
    }



    
}