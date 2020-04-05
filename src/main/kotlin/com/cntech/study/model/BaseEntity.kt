package com.cntech.study.model

import java.time.ZonedDateTime
import javax.persistence.*

/* Kotlin의 클래스는 디폴트가 final 입니다.
*  상속을 하려면 open 키워드가 필요합니다.
*  함수 역시 디폴트가 final 이기에
*  함수 앞에도 open이 붙으면 자식 클래스에서 부모클래스 메소드를
*  사용할 수 있습니다.
*  */
@MappedSuperclass
open class BaseEntity{

    /*GenerationType.IDENTITY 은 기본키 생성을 데이터베이스에 위임하는 방법*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="log_no")
    var logNo: Int? = null //코틀린은 절대 null이 올수 없다. null이 올경우에는 변수앞에 ? 키워드를 넣어주자
    @Column(name="log_date")
    var logDate: ZonedDateTime = ZonedDateTime.now()
}