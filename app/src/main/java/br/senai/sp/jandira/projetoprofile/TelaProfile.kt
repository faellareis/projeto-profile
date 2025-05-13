package br.senai.sp.jandira.projetoprofile

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TelaProfile(modifier: Modifier = Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(340.dp),
                shape = RoundedCornerShape(0.dp, 0.dp, 20.dp, 20.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.backgroundd),
                        contentDescription = "Imagem de fundo",
                        modifier = Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Voltar",
                        tint = Color.White,
                        modifier = Modifier
                            .padding(
                                start = 20.dp,
                                end = 20.dp,
                                top = 50.dp
                            )
                            .align(Alignment.TopStart)
                    )
                    Box(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 50.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.details),
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    }
                    Card(
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 100.dp)
                            .size(80.dp),
                        shape = CircleShape,
                    ) {
                        Image(
                            painter = painterResource(R.drawable.avatar2),
                            contentDescription = ""
                        )
                    }
                    Text(
                        text = stringResource(R.string.jenny),
                        color = Color.White,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 200.dp)
                    )
                    Text(
                        text = stringResource(R.string.sr),
                        color = Color(0xA8F4F4F5),
                        fontSize = 11.sp,
                        modifier = Modifier
                            .align(Alignment.TopCenter)
                            .padding(top = 230.dp)
                    )
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 15.dp, vertical = 10.dp)
                            .align(Alignment.BottomCenter),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        // Primeiro card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.Email,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.email),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        // Segundo card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.Call,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.call),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        // Terceiro card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.MailOutline,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.wpp),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                        // Quarto card
                        Card(
                            modifier = Modifier
                                .size(80.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color(0x00F4F4F5)
                            ),
                            shape = RoundedCornerShape(10.dp),
                            border = BorderStroke(1.dp, Color(0xA8F4F4F5))
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(8.dp),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Icon(
                                    modifier = Modifier.size(24.dp),
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "",
                                    tint = Color.White
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = stringResource(R.string.favorite),
                                    color = Color.White,
                                    fontSize = 12.sp
                                )
                            }
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Top
            )
            {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = " ",
                        tint = Color(0xFFEC829B),
                        modifier = Modifier.size(22.dp)
                    )
                    Text(
                        text = stringResource(R.string.email),
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(horizontal = 23.dp),
                    text = stringResource(R.string.official),
                    color = Color.LightGray,
                    fontSize = 11.sp,
                )
                Text(
                    text = stringResource(R.string.email_mich),
                    color = Color.Black,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(
                            top = 5.dp,
                            bottom = 8.dp
                        )
                        .padding(horizontal = 23.dp),
                )
                Text(
                    modifier = Modifier
                        .padding(horizontal = 23.dp),
                    text = stringResource(R.string.personal),
                    color = Color.LightGray,
                    fontSize = 11.sp,
                )
                Text(
                    text = stringResource(R.string.email_mich2),
                    color = Color.Black,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(
                            top = 5.dp,
                            bottom = 8.dp
                        )
                        .padding(horizontal = 23.dp),
                )
                HorizontalDivider(
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            start = 20.dp,
                            end = 20.dp
                        ),
                    color = Color(0x3CA6A5A3)
                )
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = " ",
                        tint = Color(0xFFEC829B),
                        modifier = Modifier.size(22.dp)
                    )
                    Text(
                        text = stringResource(R.string.phone_number),
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Text(
                    modifier = Modifier
                        .padding(horizontal = 23.dp),
                    text = stringResource(R.string.mobile),
                    color = Color.LightGray,
                    fontSize = 11.sp,
                )
                Text(
                    text = stringResource(R.string.number),
                    color = Color.Black,
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(
                            top = 5.dp,
                            bottom = 8.dp
                        )
                        .padding(horizontal = 23.dp),
                )
                HorizontalDivider(
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            start = 20.dp,
                            end = 20.dp
                        ),
                    color = Color(0x3CA6A5A3)
                )
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = " ",
                        tint = Color(0xFFEC829B),
                        modifier = Modifier.size(22.dp)
                    )
                    Text(
                        text = stringResource(R.string.team),
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 23.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.project_operation_team),
                        color = Color.Black,
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Button(
                        onClick = { },
                        contentPadding = PaddingValues(0.dp),
                        modifier = Modifier.size(36.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFEC829B)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }
                HorizontalDivider(
                    modifier = Modifier
                        .padding(
                            top = 10.dp,
                            start = 20.dp,
                            end = 20.dp
                        ),
                    color = Color(0x3CA6A5A3)
                )
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .padding(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = " ",
                        tint = Color(0xFFEC829B),
                        modifier = Modifier.size(22.dp)
                    )
                    Text(
                        text = stringResource(R.string.leads_by),
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 23.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = stringResource(R.string.darrell_steward),
                        color = Color.Black,
                        fontSize = 13.sp
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Button(
                        onClick = { },
                        contentPadding = PaddingValues(0.dp),
                        modifier = Modifier.size(36.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFEC829B)
                        )
                    ) {
                        Icon(
                            imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color(0xFFEC829B)
                            ),
                            border = BorderStroke(1.dp,
                                Color(0xFFBDBDBD))
                        ) {
                            Icon(
                                imageVector = Icons.Default.AddCircle,
                                contentDescription = " ",
                                tint = Color(0xFFEC829B),
                                modifier = Modifier.size(22.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = stringResource(R.string.add),
                                color = Color.Black,
                            )
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Button(
                            onClick = { },
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color.White,
                                contentColor = Color(0xFF1F1F1F)
                            ),
                            border = BorderStroke(1.dp, Color(0xFFBDBDBD)),
                            contentPadding = PaddingValues(8.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Default.Share,
                                contentDescription = "",
                                tint = Color(0xFFEC829B),
                                modifier = Modifier.size(20.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun TelaProfilePreview() {
    TelaProfile()
}
