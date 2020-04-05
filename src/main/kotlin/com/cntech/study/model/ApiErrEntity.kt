package com.cntech.study.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="api_err_log")
class ApiErrEntity : BaseEntity() {

    @Column(name="error_code")
    var errorCode : String ? = null
    @Column(name="error_title")
    var errorTitle : String ? = null
    @Column(name="error_msg")
    var errorMsg : String ? = null

}