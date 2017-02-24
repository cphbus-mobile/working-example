package dk.cphbusiness.template

import android.app.Activity
import android.os.Bundle
import dk.cphbusiness.template.model.Person
import dk.cphbusiness.template.model.Pet
import kotlinx.android.synthetic.main.activity_pet.*
import org.jetbrains.anko.longToast
import org.jetbrains.anko.onClick
import org.jetbrains.anko.toast

class PetActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet)
        okButton.onClick {
            val person = Person(
                    firstNameText.text.toString(),
                    lastNameText.text.toString()
                    )
            val pet = Pet(
                    petNameText.text.toString(),
                    person,
                    petAgeText.text.toString().toInt()
                    )
            longToast("The pet was: $pet")
            }
        }
    }
