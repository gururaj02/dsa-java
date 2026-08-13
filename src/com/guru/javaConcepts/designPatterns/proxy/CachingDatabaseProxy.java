package com.guru.javaConcepts.designPatterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachingDatabaseProxy implements DatabaseExecutor {
    private final DatabaseExecutor realExecutor;
    private final Map<String, String> queryCache;

    public CachingDatabaseProxy() {
        // The proxy instantiates or wraps the real heavy resource
        this.realExecutor = new RealDatabaseExecutor();
        this.queryCache = new HashMap<>();
    }

    @Override
    public String executeQuery(String sqlQuery) {
        // Intercept query request to check cache availability
        if (queryCache.containsKey(sqlQuery)) {
            System.out.println("Cache HIT! Returning cached result for: " + sqlQuery);
            return queryCache.get(sqlQuery);
        }

        System.out.println("Cache MISS! Fetching from original database connection...");
        String result = realExecutor.executeQuery(sqlQuery);
        queryCache.put(sqlQuery, result); // Save data to cache for subsequent requests
        return result;
    }
}
