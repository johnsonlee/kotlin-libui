import libui.*

fun main(args: Array<String>) = appWindow(
    title = "Authentication required",
    width = 320,
    height = 200
) {
    vbox {
        lateinit var username: TextField
        lateinit var password: PasswordField

        form {
            username = textfield("Username")
            password = passwordfield("Password")
        }

        button("Login") {
            action {
                MsgBox("${username.value}:${password.value}")
            }
        }
    }
}
