package com.secret.store.generic;

import java.util.List;

import com.secret.common.Optional;
import com.secret.model.marketprovider.MarketProviderData;

public abstract class MarketProviderDataStore {
  public abstract Optional<MarketProviderData> findBySymbol(String symbol) throws Exception;

  public abstract void save(MarketProviderData value) throws Exception;
}
