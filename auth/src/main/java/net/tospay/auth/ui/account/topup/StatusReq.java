package net.tospay.auth.ui.account.topup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StatusReq {

    @SerializedName("reference")
    @Expose
    private String reference;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

}
