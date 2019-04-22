package uk.co.massimocarli.simpletoolbartest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  private val TAG = "SimpleToolbarTest"

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setSupportActionBar(myToolbar.apply {
      setLogo(R.mipmap.ic_launcher)
      title = "Title"
      subtitle = "SubTitle"
    })
  }

  override fun onCreateOptionsMenu(menu: Menu): Boolean {
    // Inflate the menu; this adds items to the action bar if it is present.
    menuInflater.inflate(R.menu.menu_main, menu)
    return true
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    when (item.itemId) {
      R.id.action_settings -> {
        Log.d(TAG, "Settings")
        return true
      }
      R.id.action_compass -> {
        Log.d(TAG, "Compass")
        goToSecond()
        return true
      }
    }
    return super.onOptionsItemSelected(item)
  }

  private fun goToSecond() {
    Intent(this, SecondActivity::class.java).apply {
      startActivity(this)
    }
  }
}