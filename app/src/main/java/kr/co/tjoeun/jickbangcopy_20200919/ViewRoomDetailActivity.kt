package kr.co.tjoeun.jickbangcopy_20200919

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.jickbangcopy_20200919.datas.Room

class ViewRoomDetailActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {
        val roomData = intent.getSerializableExtra("roomInfo") as Room


    }
}