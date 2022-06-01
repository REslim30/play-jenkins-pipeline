package org.foo

class HelloWorld implements Serializable {
    def script
    HelloWorld(script) {
        this.script = script
    }

    def hello() {
        script.echo("hello from feature/test")

        script.echo("Testing multiple calls to script.properties...")

        script.properties.add(script.buildDiscarder(script.logRotator(numToKeepStr: '5')))
        // script.echo(script.buildDiscarder(script.logRotator(numToKeepStr: '5')))
        // script.echo(script.properties)
    }
}
