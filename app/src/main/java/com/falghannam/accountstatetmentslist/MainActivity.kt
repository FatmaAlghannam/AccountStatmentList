@file:OptIn(ExperimentalMaterial3Api::class)

package com.falghannam.accountstatetmentslist

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.falghannam.accountstatetmentslist.data.Account
import com.falghannam.accountstatetmentslist.repo.Repo
import com.falghannam.accountstatetmentslist.statement.AccountCard
import com.falghannam.accountstatetmentslist.ui.theme.AccountStatetmentsListTheme
import com.falghannam.accountstatetmentslist.data.Account as Account1

class MainActivity : ComponentActivity() {
    var account = Repo.dummyAccountsList

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccountStatetmentsListTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(topBar = {
                        TopAppBar(title = {    Text(text = "Statements")  })
                    }

                    ) {

                        StatmentAccount(modifier = Modifier.padding(it), account =account )


                    }
                    }
                }
            }
        }
    }

@Composable
fun StatmentAccount(account: List<Account1>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(account) {
            AccountCard(
                transactionType = it.transactionType,
                balance = it.balance,
                accountNumber = it.accountNumber,
                date = it.date,
                details = it.details,
                name = it.name,

                )
        }
    }

    }


    @Preview(showBackground = true)
    @Composable
    fun Account() {
        AccountStatetmentsListTheme {

        }
    }