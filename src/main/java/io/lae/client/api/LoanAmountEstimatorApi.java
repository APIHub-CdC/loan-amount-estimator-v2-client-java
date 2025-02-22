package io.lae.client.api;

import io.lae.client.ApiClient;
import io.lae.client.ApiException;
import io.lae.client.ApiResponse;
import io.lae.client.Configuration;
import io.lae.client.Pair;
import io.lae.client.ProgressRequestBody;
import io.lae.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;

import io.lae.client.model.PeticionFolioConsulta;
import io.lae.client.model.PeticionPersona;
import io.lae.client.model.Respuesta;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoanAmountEstimatorApi {
    private ApiClient apiClient;
    public LoanAmountEstimatorApi() {
        this(Configuration.getDefaultApiClient());
    }
    public LoanAmountEstimatorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    public ApiClient getApiClient() {
        return apiClient;
    }
    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
    
    public okhttp3.Call getLAEByFolioConsultaCall(String xApiKey, String username, String password, PeticionFolioConsulta request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/folioConsulta";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
        localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
        localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
        localVarHeaderParams.put("password", apiClient.parameterToString(password));
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = {
        		"application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    private okhttp3.Call getLAEByFolioConsultaValidateBeforeCall(String xApiKey, String username, String password, PeticionFolioConsulta request, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getLAEByFolioConsulta(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getLAEByFolioConsulta(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getLAEByFolioConsulta(Async)");
        }
        
        okhttp3.Call call = getLAEByFolioConsultaCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    
    public Respuesta getLAEByFolioConsulta(String xApiKey, String username, String password, PeticionFolioConsulta request) throws ApiException {
        ApiResponse<Respuesta> resp = getLAEByFolioConsultaWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }
    
    public ApiResponse<Respuesta> getLAEByFolioConsultaWithHttpInfo(String xApiKey, String username, String password, PeticionFolioConsulta request) throws ApiException {
        okhttp3.Call call = getLAEByFolioConsultaValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }



    public Respuesta getLAEByPerson(String xApiKey, String username, String password, PeticionPersona request) throws ApiException {
        ApiResponse<Respuesta> resp = getLAEByPersonWithHttpInfo(xApiKey, username, password, request);
        return resp.getData();
    }

    public ApiResponse<Respuesta> getLAEByPersonWithHttpInfo(String xApiKey, String username, String password, PeticionPersona request)
            throws ApiException {
        okhttp3.Call call = getLAEByPersonValidateBeforeCall(xApiKey, username, password, request, null, null);
        Type localVarReturnType = new TypeToken<Respuesta>() {
        }.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    private okhttp3.Call getLAEByPersonValidateBeforeCall(String xApiKey, String username, String password, PeticionPersona request,
                                                          final ProgressResponseBody.ProgressListener progressListener,
                                                          final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling creditreport(Async)");
        }
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling creditreport(Async)");
        }
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling creditreport(Async)");
        }
        if (xApiKey == null) {
            throw new ApiException("Missing the required parameter 'xApiKey' when calling getLAEByPerson(Async)");
        }

        okhttp3.Call call = getLAEByPersonCall(xApiKey, username, password, request, progressListener, progressRequestListener);
        return call;
    }
    public okhttp3.Call getLAEByPersonCall(String xApiKey, String username, String password, PeticionPersona request,
                                           final ProgressResponseBody.ProgressListener progressListener,
                                           final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = request;
        String localVarPath = "/persona";
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (xApiKey != null)
            localVarHeaderParams.put("x-api-key", apiClient.parameterToString(xApiKey));
        if (username != null)
            localVarHeaderParams.put("username", apiClient.parameterToString(username));
        if (password != null)
            localVarHeaderParams.put("password", apiClient.parameterToString(password));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = { "application/json" };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null)
            localVarHeaderParams.put("Accept", localVarAccept);
        final String[] localVarContentTypes = { "application/json" };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        if (progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener)).build();
                }
            });
        }
        String[] localVarAuthNames = new String[] {};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams,
                localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

}
