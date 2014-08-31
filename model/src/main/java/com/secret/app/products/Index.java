package com.secret.app.products;

import com.secret.app.enums.Currency;
import com.secret.app.enums.ProductType;
import lombok.Getter;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Getter
public class Index extends Product implements Serializable {

    private static final long serialVersionUID = 1251211219872297036L;
    private final String indexName;

    public Index(String id, ProductType productType, Currency currency, String marketId, String indexName) {
        super(id, productType, currency,marketId);
        this.indexName = indexName;
    }
}
