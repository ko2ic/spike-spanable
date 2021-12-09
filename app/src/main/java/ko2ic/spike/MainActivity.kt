package ko2ic.spike

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ko2ic.spike.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val viewModel = MainViewModel()

        val text = "%icon% ああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああああ"
        viewModel.text.set(text)

        binding.viewModel = viewModel
    }
}