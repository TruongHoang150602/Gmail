package com.example.gmailapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.gmailapp.model.MailData
import com.example.lapping.R

class ItemAdapter(
    private val context: Context,
    private val dataset: List<MailData>)
    : ArrayAdapter<MailData> (context, 0, dataset)
{
    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        val holder: ViewHolder

        if (itemView == null) {
            itemView = inflater.inflate(R.layout.list_item, parent, false)
            holder = ViewHolder()
            holder.profileText = itemView.findViewById(R.id.profileText)
            holder.usernameText = itemView.findViewById(R.id.usernameText)
            holder.subjectText = itemView.findViewById(R.id.subjectText)
            holder.bodyText = itemView.findViewById(R.id.bodyText)
            holder.timeStampText = itemView.findViewById(R.id.timeStampText)
            holder.starIcon = itemView.findViewById(R.id.starIcon)
            itemView.tag = holder
        } else {
            holder = itemView.tag as ViewHolder
        }

        val item = getItem(position)

        item?.let {
            holder.profileText.text = it.username[0].toString()
            holder.usernameText.text = it.username
            holder.subjectText.text = it.subject
            holder.bodyText.text = it.body
            holder.timeStampText.text = it.timeStamp
            // Đặt các giá trị khác nếu cần
        }
        return itemView!!
    }

    private class ViewHolder {
        lateinit var profileText: TextView
        lateinit var usernameText: TextView
        lateinit var subjectText: TextView
        lateinit var bodyText: TextView
        lateinit var timeStampText: TextView
        lateinit var starIcon: ImageView
    }
}