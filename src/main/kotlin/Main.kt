
import kotlinx.html.div
import kotlinx.html.dom.append
import kotlinx.html.js.onClickFunction
import kotlinx.html.span
import kotlin.browser.document
import kotlin.browser.window

/**
 * Created by aszotyori on 19.06.2018.
 *
 * Copyright (c) 2017 Gini GmbH.
 */


fun main(args: Array<String>) {
    val message = "Hello JavaScript!"
    println(message)

    window.onload = {
        document.body!!.append.div {
            span {
                +"Click me!"
            }
            onClickFunction = {
                document.body!!.append.div {
                    span {
                        +"Hello there!"
                    }
                }
            }
        }
    }
}