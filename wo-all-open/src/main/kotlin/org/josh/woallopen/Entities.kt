package org.josh.woallopen

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class A(

    @Id
    @GeneratedValue
    var id: Long = -1,

    val name: String = "A"
)

@Entity
class B(

    @Id
    @GeneratedValue
    var id: Long = -1,

    val name: String = "B"
)

@Entity
class C(

    @Id
    @GeneratedValue
    var id: Long? = -1,

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    val a: A,

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    val b: B
)