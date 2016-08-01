package security.dao;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author techne
 */
public class HttpExemplo {



	private final String USER_AGENT = "Mozilla/5.0";
 
	public static void main(String[] args) throws Exception {
 
		HttpExemplo http = new HttpExemplo(); // CRIA O OBJETO DA CLASSE POIS O MAIN NÃO ENXERGA O CONTEXTO GLOBAL SÓ O LOCAL.
 
		System.out.println("Testing 1 - Send Http GET request");
		http.sendGet(); // INVOCA O METODO QUE TRÁS OS VALORES.
 
 
	}
 
 
 
 
	// O ACESSO É FEITO VIA METODO GET 
	private void sendGet() throws Exception {
 
		String url = "http://www.w3schools.com/angular/customers.php"; // URL DE ACESSO AO WEB SERVICE --  INFORME A SUA
 
		URL obj = new URL(url);  // INSTANCIA A CLASSE QUE VAI SER UTILIZADA PARA FAZER A CONEXÃO
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();  // OBTÉM A CONEXÃO E SALVA NA VARIAVEL 'con'
 
	
		con.setRequestMethod("GET"); // INFORMA QUAL METODO SERÁ USADO (NO NOSSO CASO O GET)
 
	
		con.setRequestProperty("User-Agent", USER_AGENT); // ADICIONA A REQUISIÇÃO AO CABEÇALHO -- (propriedade geral de request)
 
 
    // APARTIR DAQUI INICIA A PARTE DE ENTRADA DE DADOS
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
 
 
    // ABAIXO SE OBTÉM OS DADOS LINHA A LINHA ATÉ NÃO HOUVER MAIS DADOS A RECEBER DO WEBSERVICE
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine); 
		}
		in.close();
 
		
		System.out.println(response.toString()); // NO FINAL IMPRIME O ARQUIVO JSON, APARTIR DAI VOCÊ PODE CONVERTER OS DADOS DE JSON PARA OBJETO.
 
	}
	
	
	
	
 
	
    
}
