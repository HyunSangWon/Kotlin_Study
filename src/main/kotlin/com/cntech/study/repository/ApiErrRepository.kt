package com.cntech.study.repository

import com.cntech.study.model.ApiErrEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ApiErrRepository : JpaRepository<ApiErrEntity , Int>{


}