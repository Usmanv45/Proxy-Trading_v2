package com.whynot.Proxy.Trading.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProxyOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "ProxyOrder_Sequence")
    @SequenceGenerator(name = "ProxyOrder_Sequence",sequenceName = "ProxyOrder_Sequence")
    private Long id;
    private String proxyId;
    private String proxyOrder;

    private String company;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProxyId() {
        return proxyId;
    }

    public void setProxyId(String proxyId) {
        this.proxyId = proxyId;
    }

    public String getProxyOrder() {
        return proxyOrder;
    }

    public void setProxyOrder(String proxyOrder) {
        this.proxyOrder = proxyOrder;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
