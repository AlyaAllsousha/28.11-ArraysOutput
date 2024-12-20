package ru.example.myapplication

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import ru.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding:ActivityMainBinding  = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(binding.root)
        val kittyArray = arrayListOf<Kitty>(
            Kitty("коричневый", "Иммануил", "Сиамский"),
            Kitty("белый", "Барсик", "Британский"),
            Kitty("черный", "Феликс", "Вислоухий"),
            Kitty("коричневый", "Брэд", "Сфинкс"),
            Kitty("серый", "Роза", "Мейн-Кун"),
            Kitty("белый", "Фиона", "Бурма"),
            Kitty("черный", "Шрек", "Американская"),
            Kitty("коричневый", "Филадельфия", "Шотландская")
            )
        val adapter = KittyAdapter(kittyArray)
        binding.RV.adapter = adapter
        binding.lifecycleOwner = this
        for(i in 0..kittyArray.size-1){
            kittyArray[i].image = fromDrawabletoBitMap(i)

        }
    }
    fun fromDrawabletoBitMap(position:Int):Bitmap{
        val drawable = when(position%4){
            0 -> {
                R.drawable.kitty1
            }
            1 -> {
                R.drawable.kitty2
            }
            2 -> {
                R.drawable.kitty3
            }
            3 -> {
                R.drawable.kytty4
            }

            else -> {
                R.drawable.kitty5
            }
        }
        return BitmapFactory.decodeResource(resources, drawable)

    }
}