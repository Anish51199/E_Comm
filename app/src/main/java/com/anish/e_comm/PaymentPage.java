package com.anish.e_comm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.volley.VolleyError;
import com.checkout.android_sdk.PaymentForm;
import com.checkout.android_sdk.Response.CardTokenisationFail;
import com.checkout.android_sdk.Response.CardTokenisationResponse;
import com.checkout.android_sdk.Utils.Environment;

public class PaymentPage extends AppCompatActivity {
   private PaymentForm mPaymentForm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_page);
        mPaymentForm = findViewById(R.id.checkout_card_form);
        mPaymentForm

            .setAcceptedCardsLabel("We accept this card types")
                .setCardHolderLabel("Name on Card")
                .setCardLabel("Card Number")
                .setDateLabel("Expiration Date")
                .setCvvLabel("Security Code")
                .setAddress1Label("Address 1")
                .setAddress2Label("Address 2")
                .setTownLabel("City")
                .setStateLabel("State")
                .setPostcodeLabel("Zip Code")
                .setPhoneLabel("Phone No.");

        mPaymentForm
                .setFormListener(mFormListener)     // set the callback
                .setEnvironment(Environment.SANDBOX)   // set the environemnt
                .setKey("pk_xxx");

    }
    PaymentForm.PaymentFormCallback mFormListener = new PaymentForm.PaymentFormCallback() {
        @Override
        public void onFormSubmit() {
            // form submit initiated; you can potentially display a loader
        }
        @Override
        public void onTokenGenerated(CardTokenisationResponse response) {
            // your token is here: response.token
            mPaymentForm.clearForm(); // this clears the Payment Form
        }
        @Override
        public void onError(CardTokenisationFail response) {
            // token request error
        }
        @Override
        public void onNetworkError(VolleyError error) {
            // network error
        }
        @Override
        public void onBackPressed() {
            // the user decided to leave the payment page
            mPaymentForm.clearForm(); // this clears the Payment Form
        }
    };
}
