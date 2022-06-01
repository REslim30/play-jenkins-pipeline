package org.foo

class HelloWorld implements Serializable {
    def script
    HelloWorld(script) {
        this.script = script
    }

    def hello() {
        script.echo("hello from feature/test")
    }
}
