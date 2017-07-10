/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.1.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.healthvault.restapi.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.healthvault.restapi.Onboardings;
import com.microsoft.healthvault.restapi.models.ErrorResponseException;
import com.microsoft.healthvault.restapi.models.OnboardingRequest;
import com.microsoft.healthvault.restapi.models.OnboardingResponse;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;
import rx.functions.Func1;

/**
 * An instance of this class provides access to all the operations defined
 * in Onboardings.
 */
public class OnboardingsImpl implements Onboardings {
    /** The Retrofit service to perform REST calls. */
    private OnboardingsService service;
    /** The service client containing this operation class. */
    private MicrosoftHealthVaultRestApiImpl client;

    /**
     * Initializes an instance of Onboardings.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OnboardingsImpl(Retrofit retrofit, MicrosoftHealthVaultRestApiImpl client) {
        this.service = retrofit.create(OnboardingsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Onboardings to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OnboardingsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.healthvault.restapi.Onboardings generateInviteCode" })
        @POST("Onboarding/GenerateInviteCode")
        Observable<Response<ResponseBody>> generateInviteCode(@Body OnboardingRequest onboardingRequest);

    }

    /**
     * Onboard a user.
     *
     * @param onboardingRequest The meta data associated with an onboarding request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OnboardingResponse object if successful.
     */
    public OnboardingResponse generateInviteCode(OnboardingRequest onboardingRequest) {
        return generateInviteCodeWithServiceResponseAsync(onboardingRequest).toBlocking().single().body();
    }

    /**
     * Onboard a user.
     *
     * @param onboardingRequest The meta data associated with an onboarding request
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OnboardingResponse> generateInviteCodeAsync(OnboardingRequest onboardingRequest, final ServiceCallback<OnboardingResponse> serviceCallback) {
        return ServiceFuture.fromResponse(generateInviteCodeWithServiceResponseAsync(onboardingRequest), serviceCallback);
    }

    /**
     * Onboard a user.
     *
     * @param onboardingRequest The meta data associated with an onboarding request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OnboardingResponse object
     */
    public Observable<OnboardingResponse> generateInviteCodeAsync(OnboardingRequest onboardingRequest) {
        return generateInviteCodeWithServiceResponseAsync(onboardingRequest).map(new Func1<ServiceResponse<OnboardingResponse>, OnboardingResponse>() {
            @Override
            public OnboardingResponse call(ServiceResponse<OnboardingResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Onboard a user.
     *
     * @param onboardingRequest The meta data associated with an onboarding request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OnboardingResponse object
     */
    public Observable<ServiceResponse<OnboardingResponse>> generateInviteCodeWithServiceResponseAsync(OnboardingRequest onboardingRequest) {
        if (onboardingRequest == null) {
            throw new IllegalArgumentException("Parameter onboardingRequest is required and cannot be null.");
        }
        Validator.validate(onboardingRequest);
        return service.generateInviteCode(onboardingRequest)
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OnboardingResponse>>>() {
                @Override
                public Observable<ServiceResponse<OnboardingResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OnboardingResponse> clientResponse = generateInviteCodeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OnboardingResponse> generateInviteCodeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OnboardingResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OnboardingResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}