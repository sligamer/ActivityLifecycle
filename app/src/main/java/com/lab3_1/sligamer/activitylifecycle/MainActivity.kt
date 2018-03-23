package com.lab3_1.sligamer.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

/**
 * Created by Justin Freres on 2/18/2018.
 * Lab 3-1 Activity Lifecycle Exploration Application
 * Plugin Support with kotlin_version = '1.2.21'
 */
class MainActivity : AppCompatActivity() {

    // Declare private variables
    private var createMessage: String? = null
    private var startMessage: String? = null
    private var resumeMessage: String? = null
    private var pauseMessage: String? = null
    private var stopMessage: String? = null
    private var restartMessage: String? = null
    //private var destroyMessage: String? = null

    // Declare val for Log message
    private val msg: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initMessage Method
        initMessages()

        // display createMessage using Toast
        Toast.makeText(this, createMessage, Toast.LENGTH_LONG).show()

        // display message using LogCat
        Log.d(msg, createMessage)
    }

    // onStart Activity
    override fun onStart() {
        super.onStart()

        // display startMessage using Toast
        Toast.makeText(this, startMessage, Toast.LENGTH_LONG).show()

        // display message using LogCat
        Log.d(msg, startMessage)
    }

    // onResume Activity
    override fun onResume() {
        super.onResume()

        // display resumeMessage using Toast
        Toast.makeText(this, resumeMessage, Toast.LENGTH_LONG).show()

        // display message using LogCat
        Log.d(msg, resumeMessage)

    }

    // onPause Activity
    override fun onPause() {
        super.onPause()

        // display pauseMessage using Toast
        Toast.makeText(this, pauseMessage, Toast.LENGTH_LONG).show()

        // display message using LogCat
        Log.d(msg, pauseMessage)
    }

    // onStop Activity
    override fun onStop() {
        super.onStop()

        // display stopMessage using Toast
        Toast.makeText(this, stopMessage, Toast.LENGTH_LONG).show()

        // display message using LogCat
        Log.d(msg, stopMessage)
    }

    // onRestart Activity
    override fun onRestart() {
        super.onRestart()

        // display restartMessage using Toast
        Toast.makeText(this, restartMessage, Toast.LENGTH_LONG).show()

        // display message using LogCat
        Log.d(msg, restartMessage)
    }

    // onDestroy Activity
    // compiler does not like this as it feels its redundant
/*    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, destroyMessage, Toast.LENGTH_LONG).show()

        Log.d(msg, destroyMessage)
    }*/

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        if(id == R.integer.action_settings){
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initMessages() {

        createMessage = this.resources.getText(R.string.create_Message) as String?

        startMessage = this.resources.getText(R.string.start_Message) as String?

        resumeMessage = this.resources.getText(R.string.resume_Message) as String?

        pauseMessage = this.resources.getText(R.string.pause_Message) as String?

        stopMessage = this.resources.getText(R.string.stop_Message) as String?

        restartMessage = this.resources.getText(R.string.restart_Message) as String?
    }


}
