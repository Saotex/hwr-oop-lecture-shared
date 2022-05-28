package hwr.oop.examples;

class HelloWorld {
    String name;

    HelloWorld(String name) {
        this.name = name;
    }

    String getOutputString() {
        return "Hello " + name;
    }
}
