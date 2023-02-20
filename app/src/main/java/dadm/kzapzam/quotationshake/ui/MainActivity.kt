package dadm.kzapzam.quotationshake.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dadm.kzapzam.quotationshake.R
import dadm.kzapzam.quotationshake.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}