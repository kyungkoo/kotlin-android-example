package com.beust.example

import android.content.Intent
import android.os.Bundle
import android.app.Activity
import android.view.Menu
import android.view.View
import android.widget.Button

open class MainActivity2 : Activity() {

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var next: Button = findViewById(R.id.Button02) as Button
        next.setOnClickListener(object : View.OnClickListener {
            public override fun onClick(view: View) {
                val intent: Intent = Intent()
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        })
    }

//    public override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_activity2, menu)
//        return true
//    }
}