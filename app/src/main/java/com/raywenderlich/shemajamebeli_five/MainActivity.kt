package com.raywenderlich.shemajamebeli_five

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val str = "[\n   [\n      {\n         \"field_id\":1,\n         \"hint\":\"UserName\",\n         \"field_type\":\"input\",\n         \"keyboard\":\"text\",\n         \"required\":false,\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      },\n      {\n         \"field_id\":2,\n         \"hint\":\"Email\",\n         \"field_type\":\"input\",\n         \"required\":true,\n         \"keyboard\":\"text\",\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      },\n      {\n         \"field_id\":3,\n         \"hint\":\"phone\",\n         \"field_type\":\"input\",\n         \"required\":true,\n         \"keyboard\":\"number\",\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      }\n   ],\n   [\n      {\n         \"field_id\":4,\n         \"hint\":\"Full Name\",\n         \"field_type\":\"input\",\n         \"keyboard\":\"text\",\n         \"required\":true,\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      },\n      {\n         \"field_id\":14,\n         \"hint\":\"Jemali\",\n         \"field_type\":\"input\",\n         \"keyboard\":\"text\",\n         \"required\":false,\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      },\n      {\n         \"field_id\":89,\n         \"hint\":\"Birthday\",\n         \"field_type\":\"chooser\",\n         \"required\":false,\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      },\n      {\n         \"field_id\":898,\n         \"hint\":\"Gender\",\n         \"field_type\":\"chooser\",\n         \"required\":\"false\",\n         \"is_active\":true,\n         \"icon\":\"https://jemala.png\"\n      }\n   ]\n]"
    }
}