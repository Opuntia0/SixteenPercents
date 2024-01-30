package com.example.sixteenpercents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {

    private lateinit var profileViewAdapter: ProfileViewAdapter
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewPager = findViewById(R.id.pager)

        val listProfile = getProfileList()

        profileViewAdapter = ProfileViewAdapter(this, listProfile)
        viewPager.adapter = profileViewAdapter

    }

    // Hide the status bar
    private fun getProfileList(): ArrayList<Profile> {
        val listProfile = arrayListOf<Profile>()

        // Ada Lovelace
        listProfile.add(Profile("Ada Lovelace", 1815, 1852, "https://upload.wikimedia.org/wikipedia/commons/b/b7/Ada_Byron_daguerreotype_by_Antoine_Claudet_1843_or_1850_-_cropped.png", "Ada Lovelace, considérée comme la première programmeuse, a collaboré avec Charles Babbage sur la \"Machine analytique\". Ses notes ont introduit le concept de programmes, soulignant que la machine pourrait manipuler des symboles, établissant ainsi les bases de la programmation informatique. Son héritage est célébré avec le langage de programmation Ada."))

        // Grace Hoper
        listProfile.add(Profile("Grace Hoper", 1906, 1992, "https://upload.wikimedia.org/wikipedia/commons/3/37/Grace_Hopper_and_UNIVAC.jpg", "Grace Hopper, pionnière de l'informatique, a joué un rôle majeur dans le développement du langage de programmation COBOL, facilitant la programmation commerciale. Elle a également popularisé le terme \"debugging\" après avoir résolu un problème en retirant un insecte d'un ordinateur. Hopper a contribué de manière significative à la standardisation et à l'expansion de l'informatique moderne."))

        // Hedy Lamarr
        listProfile.add(Profile("Hedy Lamarr", 1914, 2000, "https://upload.wikimedia.org/wikipedia/commons/d/d8/Hedy_Lamarr_in_The_Heavenly_Body_1944.jpg", "Hedy Lamarr, actrice et inventrice, a co-développé, pendant la Seconde Guerre mondiale, un système de communication appelé \"frequency hopping\" pour empêcher les interceptions radio. Ce concept a jeté les bases des technologies modernes telles que le Wi-Fi et le Bluetooth. Lamarr a ainsi apporté une contribution remarquable à la technologie de communication sans fil."))

        // Karen Jones
        listProfile.add(Profile("Karen Spärck Jones", 1935, 2007, "https://upload.wikimedia.org/wikipedia/commons/a/af/Karen_Spärck.jpg", "Karen Spärck Jones a marqué l'informatique par ses contributions au traitement automatique du langage naturel (TALN), notamment dans l'indexation automatique de documents. Ses travaux ont influencé les fondements des moteurs de recherche et des applications modernes de compréhension automatique du langage."))

        // Margaret Hamilton
        listProfile.add(Profile("Margaret Hamilton", 1936, null, "https://upload.wikimedia.org/wikipedia/commons/d/db/Margaret_Hamilton_-_restoration.jpg", "Margaret Hamilton, scientifique en informatique, a dirigé l'équipe de développement logiciel pour le projet Apollo de la NASA, jouant un rôle crucial dans l'alunissage de la mission Apollo 11. Elle a introduit le concept de \"système de priorité\" pour les logiciels, améliorant la fiabilité des programmes spatiaux. Hamilton a également cofondé une entreprise de logiciels, contribuant ainsi au développement de l'industrie logicielle."))

        return listProfile
    }

}