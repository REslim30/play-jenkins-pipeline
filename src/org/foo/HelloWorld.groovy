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

    private List properties;
    def addProperty(property) {
        this.properties.add(property)
        script.properties(this.properties)
    }
}
