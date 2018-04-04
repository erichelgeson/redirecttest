package redirecttest

import grails.converters.JSON

class FooController {

    def index() {
        render Foo.list() as JSON
    }

    def create() { }

    def save() {
        def foo = new Foo(name: params.name).save(flush:true)
        redirect action: "index", params: [id: foo?.id]
    }
}
