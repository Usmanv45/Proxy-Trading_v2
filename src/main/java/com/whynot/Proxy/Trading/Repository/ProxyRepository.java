package com.whynot.Proxy.Trading.Repository;

import com.whynot.Proxy.Trading.Entities.Proxy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyRepository extends JpaRepository<Proxy,Long> {
    boolean existsByProxyUserId(String userId);

    Proxy findByProxyUserId(String userId);
}
