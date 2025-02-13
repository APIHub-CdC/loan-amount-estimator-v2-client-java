package io.lae.client.api;

import java.util.concurrent.TimeUnit;

import io.lae.client.model.CatalogoEstados;
import io.lae.client.model.DomicilioPeticion;
import io.lae.client.model.Persona;
import org.junit.Before;
import org.junit.Test;

import io.lae.interceptor.SignerInterceptor;
import io.lae.client.ApiClient;
import io.lae.client.ApiException;
import io.lae.client.model.CatalogoSegmento;
import io.lae.client.model.PeticionFolioConsulta;
import io.lae.client.model.Respuesta;
import io.lae.client.model.PeticionPersona;
import okhttp3.OkHttpClient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ApiTest {
	
	private Logger logger = LoggerFactory.getLogger(ApiTest.class.getName());
	private final LoanAmountEstimatorApi api = new LoanAmountEstimatorApi();
	private String xApiKey = "your_api_key";
	private String username = "your_username";
	private String password = "your_password";	
	
	private ApiClient apiClient = null;

	@Before()
	public void setUp() {
		this.apiClient = api.getApiClient();
		this.apiClient.setBasePath("https://services.circulodecredito.com.mx/v2/lae");
		OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
			    .readTimeout(30, TimeUnit.SECONDS)
			    .addInterceptor(new SignerInterceptor())
			    .build();
		apiClient.setHttpClient(okHttpClient);
	}

	@Test
	public void getLAEByFolioConsultaTest() throws ApiException {
		PeticionFolioConsulta request = new PeticionFolioConsulta();

		request.setFolioOtorgante("121212");
		request.setSegmento(CatalogoSegmento.PP);
		request.setFolioConsulta("1601324798");
		
		Respuesta response = api.getLAEByFolioConsulta(this.xApiKey, this.username, this.password, request);
		logger.info(response.toString());
	}
	@Test
	public void getLAEByPersonTest() throws ApiException {
		PeticionPersona request = new PeticionPersona();
		Persona persona = new Persona();
		DomicilioPeticion domicilio = new DomicilioPeticion();

		persona.setPrimerNombre("JUAN");
		persona.setApellidoPaterno("PRUEBA");
		persona.setApellidoMaterno("CUATRO");
		persona.setFechaNacimiento("1980-01-04");
		persona.setRFC("PUAC800107");

		domicilio.setDireccion("INSURGENTES SUR 1007");
		domicilio.setColoniaPoblacion("INSURGENTES SUR");
		domicilio.setDelegacionMunicipio("CIUDAD DE MEXICO");
		domicilio.setCiudad("CIUDAD DE MEXICO");
		domicilio.setEstado(CatalogoEstados.DF);

		persona.setDomicilio(domicilio);

		request.setFolioOtorgante("121212");
		request.setSegmento(CatalogoSegmento.PP);
		request.setPersona(persona);

		Respuesta response = api.getLAEByPerson(xApiKey, username, password, request);
		logger.info(response.toString());
	}

}
