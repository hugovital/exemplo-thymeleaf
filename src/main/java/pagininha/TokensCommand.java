package pagininha;

import java.util.ArrayList;
import java.util.Random;

public class TokensCommand {
	
	private void limparAlertas(Token token) {
		token.getDevAlertsSucessos().clear();
		token.getDevAlertsInfos().clear();
		token.getDevAlertsErros().clear();
		
		token.getHomAlertsSucessos().clear();
		token.getHomAlertsInfos().clear();
		token.getHomAlertsErros().clear();
		
		token.getProdAlertsSucessos().clear();
		token.getProdAlertsInfos().clear();
		token.getProdAlertsErros().clear();
	}

	private void validarCredenciais(
			String clientId, 
			String token, 
			ArrayList<String> alertaSucesso,
			ArrayList<String> alertaInfo,
			ArrayList<String> alertaErro,
			String ambiente) {
		
		boolean ret = false;
		
		if (clientId == null || clientId.trim().equals("") ) {
			String msg = String.format("ClientId para %s é nulo ou está em branco", ambiente);
			alertaInfo.add(msg);
			ret = true;
		}
		
		if (token == null || token.trim().equals("") ) {
			String msg = String.format("Token para %s é nulo ou está em branco", ambiente);
			alertaInfo.add(msg);
			ret = true;
		}
		
		if (ret)
			return;
		
		PosterCommand command = new PosterCommand();

		int n = 3;
		for (int i = 0; i < n; i++) {

			if (command.postar("", "", "")) {
				String msg = String.format("Tentativa %s com sucesso!", i);
				alertaSucesso.add(msg);
			} else {
				String msg = String.format("Tentativa %s com erro ;(", i);
				alertaErro.add(msg);
			}
			
		}
		
	}
	
	public void validarCredenciais(Token token) {
		
		limparAlertas(token);
		
		validarCredenciais(
				token.getIddev(), 
				token.getTokendev(), 
				token.getDevAlertsSucessos(), 
				token.getDevAlertsInfos(),
				token.getDevAlertsErros(),
				"DEV");
				

		validarCredenciais(
				token.getIdhom(), 
				token.getTokenHom(), 
				token.getHomAlertsSucessos(), 
				token.getHomAlertsInfos(),
				token.getHomAlertsErros(),
				"HOM");
				
		validarCredenciais(
				token.getIdprod(), 
				token.getTokenProd(), 
				token.getProdAlertsSucessos(), 
				token.getProdAlertsInfos(),
				token.getProdAlertsErros(),
				"PROD");
		
	}	

}
