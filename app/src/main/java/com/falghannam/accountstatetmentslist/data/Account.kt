package com.falghannam.accountstatetmentslist.data

data class Account(
    val transactionType: String,
    val balance: Double,
    val accountNumber: Int,
    val date: String,
    val details: String,
    val name: String,

    )

