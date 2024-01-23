package com.falghannam.accountstatetmentslist.statement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.falghannam.accountstatetmentslist.data.Account
import com.falghannam.accountstatetmentslist.ui.theme.AccountStatetmentsListTheme

@Composable
fun AccountCard(
    transactionType: String,
    balance: Double,
    accountNumber: Int,
    date: String,
    details: String,
    name: String,
    modifier: Modifier = Modifier,
) {
    Card(
        modifier
            .fillMaxWidth()
            .height(100.dp)
            .padding(5.dp),
        colors = CardDefaults.cardColors(
            containerColor =
            MaterialTheme.colorScheme.onSurfaceVariant,
        ),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
                Text(text = " $name")
                Text(text = " $balance")
                Text(text = " $date")
                Text(text = " $transactionType")
                Text(text = " $details")
                Text(text = " $accountNumber")

        }

    }

}




@Preview(showBackground = true)
@Composable
fun AccountCardPreview() {
    AccountStatetmentsListTheme {
        AccountCard(
            transactionType = "Withdraw",
            balance = 10.2,
            accountNumber = 1,
            date = "23-1-24",
            details = "ATM",
            name = "Family"
        )
    }
}

