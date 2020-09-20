package kr.co.tjoeun.jickbangcopy_20200919.adpaters

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kr.co.tjoeun.jickbangcopy_20200919.R
import kr.co.tjoeun.jickbangcopy_20200919.datas.Room
import java.util.zip.Inflater

class RoomAdapter(val mContext: Context, val resId: Int, val mList: ArrayList<Room>) : ArrayAdapter<Room>(mContext,resId,mList) {
    val inf = LayoutInflater.from(mContext)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.room_list_item,null)
        }
        val row = tempRow!!


        return row
    }
}