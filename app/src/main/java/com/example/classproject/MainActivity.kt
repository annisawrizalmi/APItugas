package com.example.classproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.classproject.retrofit.ApiEndPoint
import com.example.classproject.retrofit.ApiService
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ApiEndPoint = ApiService.getInstance().create(ApiEndPoint::class.java)
        GlobalScope.launch{
            val result = ApiEndPoint.getquotes()
            if (result != null)
                Log.d("ClassProject: ", result.body().toString())
        }
    }

}


