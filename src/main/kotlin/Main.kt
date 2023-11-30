fun main(args: Array<String>) {
    // Access the Singleton instance
    val singletonInstance1 = Singleton
    val singletonInstance2 = Singleton

    // Both references should point to the same instance
    println(singletonInstance1 == singletonInstance2)  // Output: true

    // Using the Singleton instance
    singletonInstance1.doSomething()
    singletonInstance2.doSomething()
}