package com.mx.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "service")
public interface TourWebService extends TourApiService {
}
