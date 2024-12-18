package com.example.pertemuan7.ui.view

import android.widget.Button
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pertemuan7.Model.Mahasiswa


@Composable
fun TampilMahasiswaView(
    mhs: Mahasiswa,
    onClickButton: () -> Unit
) {
Column (modifier = Modifier.fillMaxSize()){
    TampilData(
        judul = "Nama",
        isinya =  mhs.nama
    )
    TampilData(
        judul = "Jenis Kelamin",
        isinya =  mhs.gender
    )
    TampilData(
        judul = "Email",
        isinya =  mhs.email
    )
    TampilData(
        judul = "No Handphone",
        isinya =  mhs.noHp
    )
    TampilData(
        judul = "Alamat",
        isinya =  mhs.alamat
    )
    Button(
        onClick = { onClickButton() },
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Kembali")
    }

}
}

@Composable
fun TampilData(
    judul :String,
    isinya :String
){
    Row (modifier = Modifier
        .padding(16.dp)
        .fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
        Text(judul, modifier = Modifier .weight(0.8f))
        Text(":", modifier = Modifier .weight(0.2f))
        Text(isinya, modifier = Modifier .weight(2f))

    }
}