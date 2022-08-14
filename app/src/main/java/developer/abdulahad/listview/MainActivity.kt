package developer.abdulahad.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()

        val arrayAdapter = Adapter(this ,  list  )
        grid_view.adapter = arrayAdapter

        grid_view.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "${list[i]}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun loadData() {
       list = ArrayList()

        for (i in 0..100){
            list.add(User("Iskandar $i" , "https://i.pinimg.com/originals/b4/bd/d0/b4bdd071a02bbff4803b67d86aa7984c.jpg"))
        }
    }
}