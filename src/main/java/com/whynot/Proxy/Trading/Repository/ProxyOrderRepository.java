package com.whynot.Proxy.Trading.Repository;

import com.whynot.Proxy.Trading.Entities.ProxyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProxyOrderRepository extends JpaRepository<ProxyOrder,Long> {
}
