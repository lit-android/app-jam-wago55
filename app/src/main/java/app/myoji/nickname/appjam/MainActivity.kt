package app.myoji.nickname.appjam

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception


class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent: AdapterView<*>?, view: View?, position: Int, id: Long ->
            val  adapter : ArrayAdapter<String> = listView.adapter as ArrayAdapter<String>
            val item = adapter.getItem(position)
            adapter.remove(item)
            adapter.insert(item, 0)
        }

        listView.onItemLongClickListener = AdapterView.OnItemLongClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val adapter = listView.adapter as ArrayAdapter<String>
            val item = adapter.getItem(position)
            adapter.remove(item)
            Toast.makeText(this, "削除しました！",Toast.LENGTH_SHORT).show()
            false
        }
    }

    fun add(view: View?){
        val text : String = editText.text.toString()
        Toast.makeText(this, "追加しました！",Toast.LENGTH_SHORT).show()
        adapter.add(text)
        editText.text = null
        editText.text.toString()

    }

}
