package com.example.questuserinput_020




import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FormPendaftaran(modifier: Modifier) {
    Box {
        var textNama by remember { mutableStateOf(value = "") }
        var textKota by remember { mutableStateOf(value = "") }
        var textRT by remember { mutableStateOf(value = "") }
        var textRW by remember { mutableStateOf(value = "") }
        var textTanggal by remember { mutableStateOf(value = "") }
        var textUmur by remember { mutableStateOf(value = "") }
        var textJK by remember { mutableStateOf(value = "") }

        var Nama by remember { mutableStateOf(value = "") }
        var Kota by remember { mutableStateOf(value = "") }
        var RT by remember { mutableStateOf(value = "") }
        var RW by remember { mutableStateOf(value = "") }
        var Tanggal by remember { mutableStateOf(value = "") }
        var Umur by remember { mutableStateOf(value = "") }
        var JenisKelamin by remember { mutableStateOf(value = "") }

        val gender: List<String> = listOf("Laki-laki", "Perempuan")
        val validasi = remember { mutableStateOf(false) }

        var showDialog by remember { mutableStateOf(false) }



        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.bgform2),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = stringResource(R.string.Title),
            color = colorResource(id = R.color.putihab),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxSize()
                .padding(top = 70.dp, start = 80.dp),
        )

        Card(
            modifier = Modifier
                .padding(top = 140.dp, start = 20.dp, end = 20.dp, bottom = 20.dp)
                .fillMaxWidth(),
                //.height(height = 650.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.putihab).copy(alpha = 0.6f)
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(bottom = 20.dp)
            ) {
                OutlinedTextField(
                    value = textNama,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .padding(top = 30.dp, start = 50.dp, end = 50.dp)
                        .fillMaxWidth(fraction = 1f)
                        .height(height = 70.dp),
                    label = { Text(text = "Nama Lengkap") },
                    onValueChange = {
                        textNama = it
                    }
                )

                // Spacer(modifier = Modifier.height(height = 10.dp))

                OutlinedTextField(
                    value = textKota,
                    singleLine = true,
                    shape = MaterialTheme.shapes.large,
                    modifier = Modifier
                        .padding(top = 30.dp, start = 50.dp, end = 50.dp)
                        .fillMaxWidth(fraction = 1f)
                        .height(height = 70.dp),
                    label = { Text(text = "Asal Kota") },
                    onValueChange = {
                        textKota = it
                    }
                )

                Spacer(modifier = Modifier.height(height = 20.dp))

                Row() {
                    OutlinedTextField(
                        value = textTanggal,
                        singleLine = true,

                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(start = 50.dp)
                            .width(width = 120.dp)
                            .height(height = 70.dp),
                        label = { Text(text = "Tgl Lahir") },
                        onValueChange = {
                            textTanggal = it
                        }

                    )



                    OutlinedTextField(
                        value = textRW,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(start = 30.dp)
                            .width(width = 70.dp)
                            .height(height = 70.dp),
                        label = { Text(text = "RW") },
                        onValueChange = {
                            textRW = it
                        }


                    )



                    //Spacer(modifier = Modifier.width(width = 5.dp))

                    OutlinedTextField(
                        value = textRT,
                        singleLine = true,
                        shape = MaterialTheme.shapes.large,
                        modifier = Modifier
                            .padding(start = 5.dp)
                            .width(width = 70.dp)
                            .height(height = 70.dp),
                        label = { Text(text = "RT") },
                        onValueChange = {
                            textRT = it
                        }

                    )
                }


                }

        }

    }
    }
