package com.cntech.study.service

import com.cntech.study.model.ApiErrEntity
import com.cntech.study.repository.ApiErrRepository
import org.springframework.stereotype.Service

@Service
class ApiService(val aiErrRepository : ApiErrRepository) {

    fun apiErrFindAll(): List<ApiErrEntity> ?{
        return aiErrRepository.findAll()
    }
}