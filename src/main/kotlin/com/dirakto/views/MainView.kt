package com.dirakto.views

import tornadofx.Controller
import tornadofx.View
import tornadofx.fitToParentSize
import tornadofx.group
import tornadofx.imageview
import tornadofx.pane

class MainView() : View() {
    val controller: MainController by inject()

    override val root =  pane {
        fitToParentSize()
        group {
            imageview("tiles/base/18.png") {

            }
            imageview("tiles/base/19.png") {
                scaleX /= 6
                scaleY /= 6
//                translateX = -.50
//                translateY = -.50
            }
//            imageview("tiles/base/20.png") {
//                scaleX = this@stackpane.height / 6
//                scaleY = this@stackpane.height / 6
//                translateX = .0
//                translateY = .0
//            }
        }
    }

    init {
        primaryStage.heightProperty().addListener { obs, oldVal, newVal ->
            println(newVal)
        }
    }
}


class MainController: Controller() {
    fun writeToDb(inputValue: String) {
        println("Writing $inputValue to database!")
    }
}