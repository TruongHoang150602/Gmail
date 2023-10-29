package com.example.gmailapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.gmailapp.adapter.ItemAdapter
import com.example.gmailapp.model.MailData
import com.example.lapping.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemList = mutableListOf<MailData>()
        // Thêm dữ liệu vào itemList

        val adapter = ItemAdapter(this, itemList)

        val listView = findViewById<ListView>(R.id.list_view)
        listView.adapter = adapter
    }
}