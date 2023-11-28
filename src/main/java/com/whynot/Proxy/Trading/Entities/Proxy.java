package com.whynot.Proxy.Trading.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Generated;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proxy {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Proxy_Sequence")
    @SequenceGenerator(name = "Proxy_Sequence",sequenceName = "Proxy_Sequence")
    private Long id;
    private String proxyUserId;
    @Column(length = 2000, columnDefinition = "TEXT")
    private String proxyUserToken;
    private Boolean isMaster;

    private String proxyCompany;

    public String getProxyCompany() {
        return proxyCompany;
    }

    public void setProxyCompany(String proxyCompany) {
        this.proxyCompany = proxyCompany;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProxyUserId() {
        return proxyUserId;
    }

    public void setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
    }

    public String getProxyUserToken() {
        return proxyUserToken;
    }

    public void setProxyUserToken(String proxyUserToken) {
        this.proxyUserToken = proxyUserToken;
    }

    public Boolean getMaster() {
        return isMaster;
    }

    public void setMaster(Boolean master) {
        isMaster = master;
    }
}
