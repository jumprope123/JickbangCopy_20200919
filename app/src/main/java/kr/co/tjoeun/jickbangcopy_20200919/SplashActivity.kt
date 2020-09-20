package kr.co.tjoeun.jickbangcopy_20200919

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import java.util.logging.Handler

class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        val myHandler = android.os.Handler(Looper.getMainLooper())

        myHandler.postDelayed({
            val myIntent = Intent(mContext,MainActivity::class.java)
            startActivity(myIntent)
            finish()},2500)


    }
}