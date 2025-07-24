package it.mulders.hello.cli

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import picocli.CommandLine
import kotlin.jvm.java

@CommandLine.Command(name = "hello", description = ["Greet world"])
class HelloCommand : Runnable {
    override fun run() {
        log.info("Hello, World!")
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(HelloCommand::class.java)
    }
}