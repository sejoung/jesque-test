
class TestAction(val name: String) : Runnable {
    override fun run() {
        println("name = $name")
    }
}
