package com.example.tanya_bestie

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TanyaActivity : AppCompatActivity() {

    private lateinit var detailsText: TextView
    private lateinit var layout: LinearLayout
    private lateinit var expand: CardView
    private lateinit var expandImage: ImageView
    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: Adapter
    private val tempCoinList = arrayListOf<Faq>()
    private val faqs: List<Faq> = listOf(
        Faq(
            "1",
            "Berapa lama sekali harus ganti pembalut saat menstruasi?",
            "Sebaiknya ganti pembalut tiap 3-4 jam sekali untuk mencegah pertumbuhan jamur dan bakteri."
        ),
        Faq(
            "2",
            "Bagaimana cara menggunakan pembalut yang tepat?",
            "Cuci Tangan"
        ),
        Faq(
            "3",
            "Bagaimana cara membuang pembalut bekas pakai?",
            "Lepaskan Pembalut: "
        ),
        Faq(
            "4",
            "Bagaimana memilih pembalut yang tepat untuk kebutuhan saya?",
            "Memilih pembalut yang tepat untuk kebutuhan Anda melibatkan beberapa pertimbangan."
        ),
        Faq(
            "5",
            "Apakah boleh berolahraga saat sedang menstruasi?",
            "Ya, berolahraga saat sedang menstruasi sebenarnya baik untuk kesehatan"
        ),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tanya)
        recyclerView = findViewById(R.id.recycler)
        tempCoinList.addAll(faqs)
        itemAdapter = Adapter(this, ArrayList())
        itemAdapter.setData(tempCoinList)
        recyclerView.adapter = itemAdapter
        recyclerView.isNestedScrollingEnabled = false
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }
}