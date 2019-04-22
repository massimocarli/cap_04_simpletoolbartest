package uk.co.massimocarli.simpletoolbartest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

  private val TAG = "SecondActivity"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    myToolbar.run {
      setLogo(R.mipmap.ic_launcher)
      title = "Title"
      subtitle = "Subtitle"
      setSupportActionBar(myToolbar)
    }
    getSupportActionBar()?.run {
      setDisplayHomeAsUpEnabled(true)
    }
  }
}