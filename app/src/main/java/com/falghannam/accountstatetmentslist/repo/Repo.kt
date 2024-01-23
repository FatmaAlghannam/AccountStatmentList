package com.falghannam.accountstatetmentslist.repo

import com.falghannam.accountstatetmentslist.data.Account

class Repo {
    companion object {
        var dummyAccountsList = listOf(
            Account(
                transactionType = "Withdraw",
                date = "23/1/24",
                name = "Fatma",
                details = "Saving",
                accountNumber = 7,
                balance = 11.1,
            ),
            Account(
                transactionType = "Deposit",
                date = "23/1/24",
                name = "Nada",
                details = "Alwaha",
                accountNumber = 3,
                balance = 200.1,
            )

        )
    }
}