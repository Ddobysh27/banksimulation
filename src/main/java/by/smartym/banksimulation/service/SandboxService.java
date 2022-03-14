package by.smartym.banksimulation.service;


import by.smartym.banksimulation.model.Payload;
import by.smartym.banksimulation.model.PaymentInitiationResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface SandboxService {

    @POST("/payment-requests")
    Call<PaymentInitiationResponse> paymentRequest(@Header("Authorization") String auth, @Body Payload payload);

}
