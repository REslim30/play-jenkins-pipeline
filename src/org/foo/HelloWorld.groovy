package org.foo

class HelloWorld implements Serializable {
    def script
    HelloWorld(script) {
        this.script = script
    }

    def hello() {
        script.echo("hello from feature/test")

        script.echo("Testing multiple calls to script.properties...")

        addProperty(script.buildDiscarder(script.logRotator(numToKeepStr: '5')))
    }

    private List accumulatedProperties = [];
    def addProperty(property) {
        this.accumulatedProperties.add(property)
        script.properties(this.accumulatedProperties)
    }
}
