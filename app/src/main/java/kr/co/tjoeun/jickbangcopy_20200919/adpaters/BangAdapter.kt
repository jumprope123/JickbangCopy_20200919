package kr.co.tjoeun.jickbangcopy_20200919.adpaters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.jickbangcopy_20200919.R
import kr.co.tjoeun.jickbangcopy_20200919.datas.Bang

class BangAdapter(val mContext:Context, val resId:Int, val mList:ArrayList<Bang>) :ArrayAdapter<Bang>(mContext,resId,mList){
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.bang_list_item, null)
        }
        val row = tempRow!!

        val BangPrice = row.findViewById<TextView>(R.id.priceTxt)
        val BangAddress = row.findViewById<TextView>(R.id.addressTxt)
        val BangStair = row.findViewById<TextView>(R.id.stairTxt)
        val BangExplain = row.findViewById<TextView>(R.id.explainTxt)

        val bang = mList[position]
        BangPrice.text = bang.price.toString()
        BangAddress.text = bang.adress
        BangStair.text = "${bang.stairs}층"
        BangExplain.text = bang.explain

        return row
    }
}