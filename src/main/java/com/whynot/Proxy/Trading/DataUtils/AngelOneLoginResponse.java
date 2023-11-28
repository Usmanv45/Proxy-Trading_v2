package com.whynot.Proxy.Trading.DataUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AngelOneLoginResponse {
    private String status;
    private String message;
    private AngelOneLoginResponseData data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public AngelOneLoginResponseData getData() {
        return data;
    }

    public void setData(AngelOneLoginResponseData data) {
        this.data = data;
    }
}

