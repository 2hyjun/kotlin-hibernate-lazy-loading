package org.josh.allopen

import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne
import javax.persistence.OneToMany

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
) {
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "b", targetEntity = C::class)
    var cs: List<C> = listOf()
}

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