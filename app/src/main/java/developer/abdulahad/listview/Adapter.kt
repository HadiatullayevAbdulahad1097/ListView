package developer.abdulahad.listview

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_view.view.*

class Adapter(context: Context, val list: List<User>) :
    ArrayAdapter<User>(context, R.layout.list_view, list) {

    private val TAG = "Adapter"

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView: View

        if (convertView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_view, null, false)
        } else {
            itemView = convertView
        }

        Log.d(TAG, "getView: $position")

        itemView.tv_1.text = list[position].name
        Picasso.get().load(list[position].image).into(itemView.image)

        return itemView
    }
}