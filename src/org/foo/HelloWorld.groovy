package org.foo

class HelloWorld implements Serializable {
    def steps
    HelloWorld(steps) {
        this.steps = steps
    }

    def hello() {
        script.echo("hello")
    }
}
