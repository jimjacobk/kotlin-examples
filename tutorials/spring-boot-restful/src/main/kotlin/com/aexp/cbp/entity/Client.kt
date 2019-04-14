package com.aexp.cbp.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="CLIENT")
data class Client (

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long = -1,

        @Column(name = "firstName")
        var firstName: String = "",

        @Column(name = "lastName")
        var lastName: String = "",

        @Column(name = "currency")
        var currency: String = ""

){  }