package com.rifqiananda.olympicsport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.list_view)
        var list = mutableListOf<Sports>()

        list.add(
            Sports(
                R.drawable.football, "Sepak Bola",
                "Sepak bola adalah permainan yang dilakukan oleh dua tim berbeda, dengan komposisi pemain yang berada lapangan sebanyak sebelas orang. Dimana masing-masing tim berupaya untuk menang dan mencetak gol ke gawang lawan")
        )
        list.add(
            Sports(
                R.drawable.basket, "Basket",
                "Bola basket adalah olahraga bola berkelompok. Trdiri dari dua tim dengan masing-masing tim berisi lima orang. Kedua tim saling bertanding untuk mencetak poin dengan memasukkan bola ke keranjang lawan sebanyak-banyaknya.")
        )
        list.add(
            Sports(
                R.drawable.volley, "Bola Voli",
                "Permainan Bola Voli merupakan olahraga yang menggunakan bola berbahan karet atau kulit dan dimainkan secara berkelompok oleh dua tim. Setiap tim terdiri dari 6 orang pemain yang area permainannya dipisahkan oleh net.")
        )
        list.add(
            Sports(
                R.drawable.badminton, "Bulu Tangkis",
                "Bulu tangkis adalah suatu olahraga raket yang dimainkan oleh dua orang (untuk tunggal) atau dua pasangan (untuk ganda) yang berlawanan. Bulu tangkis dimainkan dengan permainan cepat yang membutuhkan gerak reflek.")
        )
        list.add(
            Sports(
                R.drawable.tenis, "Tenis",
                "Tenis adalah olahraga yang dimainkan dengan menggunakan raket dan bola. Untuk mendapatkan poin, pemain harus membuat bola berhasil menyebrangi net dan jatuh di lapangan permainan lawan tanpa bisa dikembalikan.")
        )
        list.add(
            Sports(
                R.drawable.arrow, "Panahan",
                "Panahan adalah kegiatan menggunakan busur panah untuk menembakkan anak panah. Dalam olahraga panahan diperlukan beberapa peralatan antara lain, busur, panah, pelindung jari, pelindung lengan, dan lain-lain.")
        )
        list.add(
            Sports(
                R.drawable.swim, "Renang",
                "Renang merupakan cabang olahraga akuatik. Renang adalah upaya untuk menggerakkan (mengapungkan atau mengangkat) semua bagian tubuh ke atas permukaan air. Olahraga renang kerap dilakukan tanpa perlengkapan atau bantuan.")
        )
        list.add(
            Sports(
                R.drawable.running, "Lari",
                "Olahraga lari adalah cabang olahraga atletik yang terdiri dari lari jarak dekat, jarak menengah, jarak jauh, estafet, dan lari gawang. Olahraga ini sudah ada sejak zaman yunani kuno saat Olimpiade pertama kali diadakan.")
        )
        list.add(
            Sports(
                R.drawable.climbing, "Panjat Tebing",
                "Panjat Tebing merupakan salah satu dari sekian banyak olahraga alam bebas. Panjat Tebing merupakan olahraga outdoor extrim yang dapat mengancam nyawa jika melakukan kesalahan yang salah satunya adalah safety procedure.")
        )
        list.add(
            Sports(
                R.drawable.weight, "Angkat Berat",
                "Angkat berat adalah cabang olahraga yang bersaing untuk mengangkat beban berat yang disebut dengan barbel, yang dilakukan dengan kombinasi dari kekuatan, fleksibilitas, konsentrasi, disiplin, teknik, mental dan kekuatan fisik.")
        )

        listView.adapter = SportsAdapter(this, R.layout.sports_list, list)

        listView.setOnItemClickListener { parent, view, i, id ->
            when(i)
            {
                0 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                1 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                2 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                5 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                6 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                7 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                8 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
                9 -> Toast.makeText(this, "asdaasda", Toast.LENGTH_SHORT).show()
            }
        }
    }
}