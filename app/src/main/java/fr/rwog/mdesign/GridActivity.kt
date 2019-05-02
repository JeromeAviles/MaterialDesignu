package fr.rwog.mdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.*

class GridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid)
    }


    fun clickedMail(button:View) {
        email("aviles.jerome@gmail.com", "Objet de l'email", "Messaaaaage")
    }



    fun clickedShare(button:View) {
        share("J'ai créé la viiiie !" , "Amazing")
    }

    fun clickedAlert(button:View) {
        alert("Une alerte a été déclenchée !!! \n You can't escape !") {
            title = "Alerte !"
            isCancelable = false
            positiveButton("OK") { toast("Positif") }
            negativeButton("KO") { toast("Négatif")}
            neutralPressed("Neutre") {toast("Neutre")}
        }.show()


    }

    fun clickedBrowse(button:View) {
        browse("http://www.google.fr")
    }

    fun clickedNewActivity(button:View) {
        toast("Voyage vers l'autre activity !")
        startActivity<ConstraintActivity>()
    }
}
