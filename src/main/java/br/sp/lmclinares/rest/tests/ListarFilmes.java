package br.sp.lmclinares.rest.tests;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import br.sp.lmclinares.rest.core.BaseTest;

public class ListarFilmes extends BaseTest {
	
	@Test
	public void deveListarFilmesBemAvaliados () {
			given()	
			.queryParam("api_key", BASE_API_KEY)
			.when()
				.get("movie/top_rated")
			.then()
			.statusCode(200)
			.body("results.original_title[2]", containsString("Justice League Dark: Apokolips War"));
	}
	
	@Test
	public void deveConsultarFilmePeloTitulo () {
			given()
			.queryParam("api_key", BASE_API_KEY)
			.queryParam("query", "batman")
			.when()
				.get("search/movie")
			.then()
			.statusCode(200)
     		.body("total_results", is(120))
			.body("results.title[4]", is("Batman Returns"));
	}
	
	@Test
	public void naoDeveListarFilmeComTituloInvalido () {
			given()
			.queryParam("api_key", BASE_API_KEY)
			.queryParam("query", "alohomora321")
			.when()
				.get("search/movie")
			.then()
			.log().all()
			.statusCode(200)
     		.body("total_results", is(0));
	}

}
