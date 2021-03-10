package com.example.submissionandroidpemula

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var title: String = "List Rumah Sakit"

    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }

    private lateinit var rvRumahSakit: RecyclerView
    private var list: ArrayList<RumahSakit> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        setActionBarTitle(title)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRumahSakit = findViewById(R.id.rv_rs)
        rvRumahSakit.setHasFixedSize(true)

        list.addAll(RumahSakitData.listData)
        showRecyclerList()

    }

    //show list
    private fun showRecyclerList() {
        rvRumahSakit.layoutManager = LinearLayoutManager(this)
        val listRumahSakitAdapter = ListRumahSakitAdapter(list)
        rvRumahSakit.adapter = listRumahSakitAdapter

        listRumahSakitAdapter.setOnItemClickCallback(object : ListRumahSakitAdapter.OnItemClickCallback {
            override fun onItemClicked(data: RumahSakit, position: Int) {
                showDetailRs(data, position)
            }
        })

    }

    // menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode) {
            R.id.action_list -> {
                title = "List Rumah Sakit"
                showRecyclerList()
            }
            R.id.action_about -> {
                showAbout()
            }
        }
        setActionBarTitle(title)
    }

    // about
    private fun showAbout(){
        val about = Intent(this, AboutActivity::class.java)
        startActivity(about)
    }

    //detail
    private fun showDetailRs(data : RumahSakit, position: Int){
        val intentDetail = Intent(this, DetailRumahSakit::class.java)
        intentDetail.putExtra(DetailRumahSakit.EXTRA_RS, position)
        startActivity(intentDetail)
    }


}