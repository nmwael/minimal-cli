package it.mulders.hello.cli

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import picocli.CommandLine
import kotlin.jvm.java

@CommandLine.Command(name = "hello", mixinStandardHelpOptions = true, description = ["Greet someone"])
class HelloCommand : Runnable {
    @CommandLine.Parameters(
        arity = "0..1",
        description = ["Who to greet"],
        defaultValue = "World",
        paramLabel = "name"
    )
    lateinit var name: String

    @CommandLine.Option(
        arity = "0",
        description = ["Output in all-capitals"],
        names = ["-c", "--capitals"]
    )
    var capitals: Boolean = false

    override fun run() {
        log.info("Hello, $name!")
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(HelloCommand::class.java)
    }
}