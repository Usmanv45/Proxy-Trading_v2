package com.whynot.Proxy.Trading.DataUtils;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AngelUser {
    private String clientcode;
    private String password;
    private String totp;
}
