package br.sp.lmclinares.rest.core;

import io.restassured.http.ContentType;

public interface Constantes {
	String APP_BASE_URL = "https://api.themoviedb.org/3";
	Integer APP_PORT = 443;
	String APP_BASE_PATH = "";
	String BASE_API_KEY = "69e2cbe0bb3ce4d1eb96f03e402bc59c";
		
	ContentType APP_CONTENT_TYPE = ContentType.JSON;
	
	Long MAX_TIMEOUT = 5000L;
}
