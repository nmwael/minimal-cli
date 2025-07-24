package it.mulders.hello

import io.quarkus.runtime.QuarkusApplication
import io.quarkus.runtime.annotations.QuarkusMain
import it.mulders.hello.cli.HelloCommand
import jakarta.inject.Inject
import picocli.CommandLine

@CommandLine.Command(
    mixinStandardHelpOptions = true,
    name = "hello",
    subcommands = [HelloCommand::class],
)
@QuarkusMain
class HelloApplication @Inject constructor(val factory: CommandLine.IFactory) : QuarkusApplication {
    override fun run(vararg args: String): Int = CommandLine(this, factory).execute(*args)
}