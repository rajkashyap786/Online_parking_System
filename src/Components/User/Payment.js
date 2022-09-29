import React from "react";
import GooglePayButton from "@google-pay/button-react";
// import { Route, Routes, Link } from "react-router-dom";

function Payment() {
    return (
        <div className="pay">
            <GooglePayButton
                environment="TEST"
                paymentRequest={{
                    apiVersion: 2, apiVersionMinor: 0, allowPaymentMethods: [{
                        type: "CARD",
                        parameters: {
                            allowedAuthMethods: ["PAN_ONLY", "CRYPTOGRAM_3DS"],
                            allowedCardNetworks: ["MASTERCARD", "VISA"]
                        },
                        tokenizationSpecification: {
                            type: "PAYMENT_GATEWAY", parameters: {
                                gateway: "parkingpay",
                                gatewayMerchantId: "parkingpayGateMerchantID"
                            }
                        }
                    }],
                    merchantInfo: {
                        merchantId: "",
                        merchantName: ""
                    },
                    transactionInfo: {
                        totalPriceStatus: "FINAL",
                        totalPriceLabel: "Total",
                        totalPrice: "10",
                        currencyCode: "INR",
                        countryCode: "+91"
                    },
                    shippingAddressRequired: true,
                    callbackIntents: ["PAYMENT_AUTHORIZATION"]
                }}
                onLoadPaymentData={paymentRequest => {
                    console.log(paymentRequest)
                }}
                onPaymentAuthorized={paymentData => {
                    console.log(paymentData);
                    return { transactionState: 'SUCCESS' }
                }}
                existingPaymentMethodRequired='false'
                buttonColor="Black"
                buttonType="buy"
            >
            </GooglePayButton>


        </div >
    );
}

export default Payment;