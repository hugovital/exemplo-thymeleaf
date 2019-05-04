package pagininha;

import java.util.ArrayList;

public class Token {
	
	private String iddev;
	private String tokendev;
	
	private String idhom;
	private String tokenHom;
	
	private String idprod;
	private String tokenProd;

	private ArrayList<String> devAlertsErros = new ArrayList<String>();
	private ArrayList<String> devAlertsInfos = new ArrayList<String>();
	private ArrayList<String> devAlertsSucessos = new ArrayList<String>();
	
	private ArrayList<String> homAlertsErros = new ArrayList<String>();
	private ArrayList<String> homAlertsInfos = new ArrayList<String>();
	private ArrayList<String> homAlertsSucessos = new ArrayList<String>();
	
	private ArrayList<String> prodAlertsErros = new ArrayList<String>();
	private ArrayList<String> prodAlertsInfos = new ArrayList<String>();
	private ArrayList<String> prodAlertsSucessos = new ArrayList<String>();

	public String getIddev() {
		return iddev;
	}
	public void setIddev(String iddev) {
		this.iddev = iddev;
	}
	public String getTokendev() {
		return tokendev;
	}
	public void setTokendev(String tokendev) {
		this.tokendev = tokendev;
	}
	public String getIdhom() {
		return idhom;
	}
	public void setIdhom(String idhom) {
		this.idhom = idhom;
	}
	public String getTokenHom() {
		return tokenHom;
	}
	public void setTokenHom(String tokenHom) {
		this.tokenHom = tokenHom;
	}
	public String getIdprod() {
		return idprod;
	}
	public void setIdprod(String idprod) {
		this.idprod = idprod;
	}
	public String getTokenProd() {
		return tokenProd;
	}
	public void setTokenProd(String tokenProd) {
		this.tokenProd = tokenProd;
	}
	public ArrayList<String> getDevAlertsErros() {
		return devAlertsErros;
	}
	public void setDevAlertsErros(ArrayList<String> devAlertsErros) {
		this.devAlertsErros = devAlertsErros;
	}
	public ArrayList<String> getDevAlertsSucessos() {
		return devAlertsSucessos;
	}
	public void setDevAlertsSucessos(ArrayList<String> devAlertsSucessos) {
		this.devAlertsSucessos = devAlertsSucessos;
	}
	public ArrayList<String> getHomAlertsErros() {
		return homAlertsErros;
	}
	public void setHomAlertsErros(ArrayList<String> homAlertsErros) {
		this.homAlertsErros = homAlertsErros;
	}
	public ArrayList<String> getHomAlertsSucessos() {
		return homAlertsSucessos;
	}
	public void setHomAlertsSucessos(ArrayList<String> homAlertsSucessos) {
		this.homAlertsSucessos = homAlertsSucessos;
	}
	public ArrayList<String> getProdAlertsErros() {
		return prodAlertsErros;
	}
	public void setProdAlertsErros(ArrayList<String> prodAlertsErros) {
		this.prodAlertsErros = prodAlertsErros;
	}
	public ArrayList<String> getProdAlertsSucessos() {
		return prodAlertsSucessos;
	}
	public void setProdAlertsSucessos(ArrayList<String> prodAlertsSucessos) {
		this.prodAlertsSucessos = prodAlertsSucessos;
	}
	public ArrayList<String> getDevAlertsInfos() {
		return devAlertsInfos;
	}
	public void setDevAlertsInfos(ArrayList<String> devAlertsInfos) {
		this.devAlertsInfos = devAlertsInfos;
	}
	public ArrayList<String> getHomAlertsInfos() {
		return homAlertsInfos;
	}
	public void setHomAlertsInfos(ArrayList<String> homAlertsInfos) {
		this.homAlertsInfos = homAlertsInfos;
	}
	public ArrayList<String> getProdAlertsInfos() {
		return prodAlertsInfos;
	}
	public void setProdAlertsInfos(ArrayList<String> prodAlertsInfos) {
		this.prodAlertsInfos = prodAlertsInfos;
	}

}

