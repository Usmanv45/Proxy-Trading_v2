package com.whynot.Proxy.Trading.Services;

import com.whynot.Proxy.Trading.DataUtils.UserDetails;
import org.springframework.stereotype.Service;

public interface UserService {
    public String saveAliceUserDetails(UserDetails userDetails);
    public String saveAngelUserDetails(UserDetails userDetails);
}
