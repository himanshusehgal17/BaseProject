package com.himanshu.baseproject

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

public class BaseActivity : AppCompatActivity(){

   public fun showToast(msg:String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
}