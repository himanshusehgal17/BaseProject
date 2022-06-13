package com.himanshu.baseproject

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity(){

   open fun showToast(msg:String) {
        Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
    }
}