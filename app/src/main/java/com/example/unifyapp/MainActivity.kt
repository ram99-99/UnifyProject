package com.example.unifyapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val  date = "29-May-2024"
        val  ugx = "UGX 10,000"
        val  status = "As presented"

        val composeView = findViewById<ComposeView>(R.id.compose_view)
        composeView.setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(1.dp)
                        .background(Color.White), // Set the background color to white
                    verticalAlignment = Alignment.CenterVertically
                ){
                    // Heading
                    IconButton(
                        onClick = { /* Handle arrow button click here */ },
                        modifier = Modifier.size(48.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = null,
                            tint = Color.DarkGray
                        )
                    }
                    Text(
                        text = "Mandate Details",
                        style = MaterialTheme.typography.headlineSmall.copy(fontSize = 15.sp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f) // Take the full row width
                            .padding(start = 2.dp),
                        textAlign = TextAlign.Center
                    )
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(containerColor = White),
                ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                        ) {
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(style = SpanStyle(fontSize = 10.sp)) {
                                        append("Valid till - ")
                                    }
                                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 10.sp)) {
                                        append(date) // Display the time value
                                    }
                                },
                            )
                            Text(
                                text = buildAnnotatedString {
                                    withStyle(style = SpanStyle(fontSize = 10.sp)) {
                                        append("Upto Amount - ")
                                    }
                                    withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 10.sp)) {
                                        append(ugx)
                                    }
                                },
                            )
                        }
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .background(color = Color.Black)
                        )
                        Text(
                            text = buildAnnotatedString {
                                withStyle(style = SpanStyle(fontSize = 10.sp)) {
                                    append("Frequency- ")
                                }
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 10.sp)) {
                                    append(status)
                                }
                            },
                        )
                        Divider(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .background(color = Color.Black)
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 10.dp)
                                .background(
                                    color = Color(500, 165, 0, 128),
                                    shape = RoundedCornerShape(10.dp) // Set the shape to round
                                )
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(5.dp),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                // Info icon
                                IconButton(
                                    onClick = { /* Handle info button click here */ },
                                    modifier = Modifier.size(15.dp)
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Info,
                                        contentDescription = null,
                                        //  tint = Color.,
                                    )
                                }

                                Text(
                                    text = buildAnnotatedString {
                                        withStyle(style = SpanStyle(fontSize = 8.sp)) {
                                            append("The amount will be blocked when ride is booked with\n")
                                            append("SafeFoda, Subject to above mentioned limit and validity.\n")
                                            append("The limit is up to ")
                                            withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
                                                append(ugx)
                                            }
                                        }
                                    },
                                    textAlign = TextAlign.Start,
                                    color = Color.Black
                                )
                            }
                        }
                    }
                }

                Text(
                    text = "AutoPay Payment Options:",
                    style = MaterialTheme.typography.headlineSmall
                        .copy(fontSize = 13.sp, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                ) {
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .border(2.dp, Color.LightGray, shape = RoundedCornerShape(4.dp))
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.aritel),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .background(Color.White)
                            .padding(4.dp) // Add padding to create space
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.fp),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    Box(
                        modifier = Modifier
                            .size(90.dp)
                            .background(Color.White)
                            .padding(4.dp) // Add padding to create space
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.m),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                }
                Text(
                    text = "Pay Using",
                    style = MaterialTheme.typography.headlineSmall
                        .copy(fontSize = 13.sp, fontWeight = FontWeight.Bold),
                    textAlign = TextAlign.Center
                )

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp)
                        .border(2.dp, Color.LightGray, RoundedCornerShape(10.dp)),
                    shape = RoundedCornerShape(10.dp),
                    colors = CardDefaults.cardColors(containerColor = White),
           ) {
                    Column(
                        modifier = Modifier
                            .padding(16.dp)
                            .fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(10.dp),
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.alogo),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp) // Adjust the size as needed
                            )
                            Text(
                                text = "Airtel Money - XXX897:",
                                style = MaterialTheme.typography.headlineSmall.copy(fontSize = 10.sp),
                                textAlign = TextAlign.Start,
                                modifier = Modifier.weight(1f)
                            )
                            Spacer(modifier = Modifier.weight(1f))
                            IconButton(
                                onClick = { /* Handle arrow button click here */ },
                                modifier = Modifier.size(10.dp)
                            ) {
                                Icon(
                                    imageVector = Icons.Default.KeyboardArrowRight,
                                    contentDescription = null,
                                    tint = Color.DarkGray
                                )

                            }
                        }
                    }

                }
            }
        }
    }
}
